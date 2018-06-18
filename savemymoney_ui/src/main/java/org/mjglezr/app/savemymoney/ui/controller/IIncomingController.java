package org.mjglezr.app.savemymoney.ui.controller;

import org.mjglezr.app.savemymoney.entity.Incoming;
import org.mjglezr.app.savemymoney.service.IncomingService;

import java.util.List;

public interface IIncomingController<T> {

    public T saveIncoming(T incoming);

    public List<T> findAll();
}
