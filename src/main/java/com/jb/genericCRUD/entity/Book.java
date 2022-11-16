package com.jb.genericCRUD.entity;

import com.jb.genericCRUD.Generics.entity.GenericDomainBasedEntity;
import com.jb.genericCRUD.Generics.entity.GenericEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book extends GenericDomainBasedEntity implements GenericEntity<Book> {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "description")
    private String description;
    @Override
    public void update(Book source) {

    }

    @Override
    public Book createNewInstance() {
        return null;
    }
}
