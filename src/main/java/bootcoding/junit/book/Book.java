package bootcoding.junit.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Book {
    private String bookId;
    private String title;
    private String author;
    private String publisher;
}
