package com.ws.workspace.controller;
import com.ws.workspace.services.GenriqueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class AbstractController<T> {
    // Inject your service layer, which should handle the business logic for the entity T
    protected abstract GenriqueService<T> genriqueService();

    @GetMapping
    public ResponseEntity<List<T>> getAllEntities() {
        List<T> entities = genriqueService().getAll();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<T>>getEntityById(@PathVariable UUID id) {
         Optional<T> entity = genriqueService().findOne(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<T> createEntity(@RequestBody T entity) {
        T createdEntity = genriqueService().AddOne(entity);
        return new ResponseEntity<>(createdEntity, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> updateEntity( @RequestBody T entity) {
        T updatedEntity = genriqueService().update( entity);
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable UUID id) {
        genriqueService().deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}