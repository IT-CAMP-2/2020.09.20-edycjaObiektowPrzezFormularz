package pl.camp.it.services;

import pl.camp.it.model.Book;

public interface IBookService {
    Book getBookById(int id);
    void saveBook(Book book);
}
