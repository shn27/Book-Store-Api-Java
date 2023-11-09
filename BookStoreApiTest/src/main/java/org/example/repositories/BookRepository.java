package org.example.repositories;

import org.example.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookRepository   {
    static List<Book> books = new ArrayList<>() ;
    public BookRepository( ) {
//        Book book = new Book(1L, "A" , "B" , "C") ;
//        books.add(book) ;
    }

    public List<Book> getBooks() {
        System.out.println("What the hack bro");
        return books;
    }
    public Book save(Book book) {
        books.add(book) ;
        return book ;
    }

    public void deleteById(Long id) {
        int x = 0 ;
        for(Book book : books){
            if(Objects.equals(book.getId(), id)){
                books.remove(x) ;
                break;
            }
            x++ ;
        }
    }
    public Book findById(Long id) {
        for(Book book : books){
            if(Objects.equals(book.getId(), id)){
                return book ;
            }
        }
        return null ;
    }
}
