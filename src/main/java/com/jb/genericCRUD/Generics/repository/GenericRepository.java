package com.jb.genericCRUD.Generics.repository;

import com.jb.genericCRUD.Generics.entity.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@NoRepositoryBean
public interface GenericRepository<E extends GenericEntity> extends JpaRepository<E, Long>, JpaSpecificationExecutor<E> {

    List<E> findAllByIdInAndIsActive(Set<Long> ids, Boolean isActive);

    Page<E> findAllByIsActive(Boolean isActive, Pageable pageable);

    Optional<E> findByIdAndIsActiveTrue(Long id);
    List<E> findAllByIdIn(Set<Long> ids);
}
