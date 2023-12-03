package com.ws.workspace.services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.UUID;
import java.util.List;
import java.util.Optional;

public interface GenriqueService<T> {
    List<T> getAll();
    Page<T> getPage(Pageable pageable);
    Optional<T> findOne(UUID id);
    T AddOne(T todo);
    T update(T t);
    void deleteById(UUID id);
}
