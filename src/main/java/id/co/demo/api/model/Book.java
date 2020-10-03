package id.co.demo.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;
@Entity
@Table(name = "books")
@Data
public class Book {

	@Id
    @GeneratedValue
    private Long id;
@NotBlank
    private String book_name;
@NotBlank
    private String author_name;
@NotBlank
    private String isbn;
}
