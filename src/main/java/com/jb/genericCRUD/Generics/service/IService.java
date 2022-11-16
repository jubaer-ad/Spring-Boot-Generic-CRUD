package com.jb.genericCRUD.Generics.service;

import com.jb.genericCRUD.Generics.entity.GenericDomainBasedEntity;
import com.jb.genericCRUD.Generics.entity.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService <E extends GenericEntity>{

    <T> T getSingle(Long id);

    E findById(Long id);

    E create(E e);

    E update(E e, Long id);

    E saveItem(E e);

    Page<E> getAll(Pageable pageable);

}
