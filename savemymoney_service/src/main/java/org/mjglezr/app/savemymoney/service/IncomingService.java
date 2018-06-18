package org.mjglezr.app.savemymoney.service;

import org.mjglezr.app.savemymoney.entity.Incoming;

import java.util.List;

public interface IncomingService<T extends Incoming> {

    public T save(T incoming);

    public Iterable<T> findAll();
}
