package bootcoding.junit.book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> listOfBooks= new ArrayList<>();

    public void addBook(Book book)
    {
        listOfBooks.add(book);
    }
    public List<Book> getAllBook()
    {
        return listOfBooks;
    }
    public Book getBookById(String BookId)
    {
        for(Book book:listOfBooks)
        {
           if(BookId.equals(book.getBookId()))
           {
               return book;
           }
        }
        return null;
    }
    public String[] getBookIdsByPublisher(String publisher)
    {
        List<String>bookById= new ArrayList<>();
        for(Book book :listOfBooks)
        {
            if(publisher.equals(book.getPublisher()))
            {
                bookById.add(book.getPublisher());
            }
        }
        return bookById.toArray(new String[bookById.size()]);
    }

    public List<String> getBookTitlesByPublisher(String publisher) {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (publisher.equals(book.getPublisher()))
            {
                bookTitles.add(book.getTitle());
            }
        }
        return bookTitles;
    }

}
