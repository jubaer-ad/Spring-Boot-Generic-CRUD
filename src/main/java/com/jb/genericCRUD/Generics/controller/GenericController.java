package com.jb.genericCRUD.Generics.controller;

import com.jb.genericCRUD.Generics.entity.GenericDomainBasedEntity;
import com.jb.genericCRUD.Generics.entity.GenericEntity;
import com.jb.genericCRUD.Generics.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class GenericController<E extends GenericDomainBasedEntity & GenericEntity> implements IController<E> {

    private final IService<E> service;

    protected GenericController(IService<E> service) {
        this.service = service;
    }

    @Override
    @GetMapping
    public Page<E> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }

    @Override
    public <T> T getSingle(Long id) {
        return service.getSingle(id);
    }

    @Override
    public ResponseEntity create(E e) {
        return ResponseEntity.ok(service.create(e).getId());
    }
}
