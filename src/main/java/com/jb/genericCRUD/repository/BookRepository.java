package com.jb.genericCRUD.repository;

import com.jb.genericCRUD.Generics.repository.GenericRepository;
import com.jb.genericCRUD.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface BookRepository extends GenericRepository<Book> {

    @Query("select b from Book b where b.name = :name")
    Optional<Book> findByName(@Param("name") String name);

    @Query(" select p.name from Position p where p.isActive= true")
    Set<String> getAllNames();

    Set<Book> findAllByIsActiveTrue();
}
