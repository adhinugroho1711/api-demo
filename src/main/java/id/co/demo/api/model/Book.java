package id.co.demo.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;
@Entity
@Table(name = "books")
@Data
public class Book  extends Auditable<String>{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@NotBlank
    private String book_name;
@NotBlank
    private String author_name;
@NotBlank
    private String isbn;
}
