package com.jb.genericCRUD.service;

import com.jb.genericCRUD.Generics.repository.GenericRepository;
import com.jb.genericCRUD.Generics.service.GenericService;
import com.jb.genericCRUD.entity.Book;
import com.jb.genericCRUD.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends GenericService<Book> implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(GenericRepository<Book> repository, BookRepository bookRepository) {
        super(repository);
        this.bookRepository = bookRepository;
    }


    @Override
    protected Book updateEntity(Book e1, Book e2) {
        Book updateDBook = findById(e2.getId());
        updateDBook.setName(e1.getName());
        updateDBook.setAuthor(e1.getAuthor());
        updateDBook.setDescription(e1.getDescription());
        return updateDBook;
    }


    public Book findByName(Book b) {
        return bookRepository.findByName(b.getName()).orElse(null);
    }


}
