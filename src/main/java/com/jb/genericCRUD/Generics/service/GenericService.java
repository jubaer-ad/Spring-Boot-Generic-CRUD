package com.jb.genericCRUD.Generics.service;

import com.jb.genericCRUD.Generics.entity.GenericDomainBasedEntity;
import com.jb.genericCRUD.Generics.entity.GenericEntity;
import com.jb.genericCRUD.Generics.repository.GenericRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RequiredArgsConstructor
public abstract class GenericService<E extends GenericDomainBasedEntity & GenericEntity > implements IService<E> {

    private final GenericRepository<E> repository;

    protected abstract E updateEntity(E e1, E e2);

    @Override
    public E getSingle(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public E findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public E create(E e) {
        return saveItem(e);
    }

    @Override
    public E update(E e, Long id) {
        final E entity = updateEntity(e, findById(id));
        return saveItem(entity);
    }

    @Override
    public E saveItem(E e) {
        return repository.save(e);
    }

    @Override
    public Page<E> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
