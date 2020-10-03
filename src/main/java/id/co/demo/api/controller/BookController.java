package id.co.demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import id.co.demo.api.exception.BookNotFoundException;
import id.co.demo.api.model.Book;
import id.co.demo.api.repository.BookRepository;

import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/books")
	public List<Book> getAllNotes() {
		return bookRepository.findAll();
	}

// Create a new Note
	@PostMapping("/books")
	public Book createNote(@Valid @RequestBody Book book) {
		return bookRepository.save(book);
	}

// Get a Single Note
	@GetMapping("/books/{id}")
	public Book getNoteById(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
		return bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
	}


// Delete a Note
	@DeleteMapping("/books/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
		Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));

		bookRepository.delete(book);

		return ResponseEntity.ok().build();
	}
}
