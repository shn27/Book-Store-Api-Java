package org.example.services;

import org.example.entities.Book;
import org.example.repositories.BookRepository;

import java.util.List;
import java.util.Optional;

public class BookService {
     BookRepository books = new BookRepository();

    public BookService() {
    }
    public List<Book> getBooks() {
        return books.getBooks();
    }


    public Book getBook(Long id) {
        return books.findById(id);
    }

    public void deleteBook(Long id) {
        books.deleteById(id);
    }
    public Book saveBook(Book book) {
        return books.save(book);
    }

}
