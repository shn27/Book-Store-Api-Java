package org.example.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.entities.Book;
import org.example.repositories.BookRepository;
import org.example.services.BookService;

import java.util.List;
import java.util.Optional;

@Path("Book")
public class BookController {
    BookService bookService = new BookService();
   // @Path("books")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

   // @GetMapping("/getBook/{id}")
  @Path("/getBook/{id}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
    public Book getBook(@PathParam(value = "id") Long id) {
        Book book = bookService.getBook(id);
        return book ;
    }

   // @PostMapping("/saveBook")

    @Path("addBook")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Book saveBook( Book book) {
        return bookService.saveBook(book);
    }

   @Path("deleteBook/{id}")
   @DELETE
   @Produces(MediaType.APPLICATION_JSON)
    public void deleteBook(@PathParam(value = "id") Long id) {
        bookService.deleteBook(id);
    }
}
