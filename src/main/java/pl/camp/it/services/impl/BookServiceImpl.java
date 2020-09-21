package pl.camp.it.services.impl;

import org.springframework.stereotype.Service;
import pl.camp.it.model.Book;
import pl.camp.it.services.IBookService;

@Service
public class BookServiceImpl implements IBookService {
    @Override
    public Book getBookById(int id) {
        Book book = new Book();
        book.setId(5);
        book.setName("Kasiążka");
        book.setAuthor("Autor Mateusz");
        book.setIsbn("saydg7tsf6sud");
        return book;
    }

    @Override
    public void saveBook(Book book) {
        System.out.println("Zapisana !!");
        System.out.println(book);
    }
}
