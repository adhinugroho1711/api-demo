package id.co.demo.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.demo.api.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
