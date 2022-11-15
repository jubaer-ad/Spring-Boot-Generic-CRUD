package com.jb.genericCRUD.Generics.entity;

public interface GenericEntity<T> {
    void update(T source);
    Long getId();
    T createNewInstance();
}
