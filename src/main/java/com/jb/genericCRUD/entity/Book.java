package com.jb.genericCRUD.entity;

import com.jb.genericCRUD.Generics.entity.GenericDomainBasedEntity;
import com.jb.genericCRUD.Generics.entity.GenericEntity;

public class Book extends GenericDomainBasedEntity implements GenericEntity<Book> {
    @Override
    public void update(Book source) {

    }

    @Override
    public Book createNewInstance() {
        return null;
    }
}
