package org.mjglezr.app.savemymoney.service.impl;

import org.mjglezr.app.savemymoney.entity.Incoming;
import org.mjglezr.app.savemymoney.service.IncomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public class IncomingServiceImpl<T extends Incoming, R extends CrudRepository<T, Long>> implements IncomingService<T> {

    @Autowired
    R repository;

    @Override
    public T save(T incoming) {
        return repository.save(incoming);
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }
}
