package com.jb.genericCRUD.Generics.controller;

import com.jb.genericCRUD.Generics.entity.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface IController <E extends GenericEntity> {

    Page<E> getAll(Pageable pageable);

    <T>T getSingle(Long id);

    ResponseEntity create(E e);

    ResponseEntity update(E e, Long id);

    ResponseEntity updateActiveStatus(Long id, Boolean isActive);

}
