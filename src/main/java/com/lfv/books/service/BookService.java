package com.lfv.books.service;

import org.springframework.stereotype.Service;

import com.lfv.books.model.Book;
import com.lfv.books.repository.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    book.setAuthor(updatedBook.getAuthor());
                    book.setDescription(updatedBook.getDescription());
                    book.setImage(updatedBook.getImage());
                    book.setBackImage(updatedBook.getBackImage());
                    book.setLink(updatedBook.getLink());
                    return bookRepository.save(book);
                }).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}