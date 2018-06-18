package org.mjglezr.app.savemymoney.ui.controller;

import com.google.common.collect.Lists;
import org.mjglezr.app.savemymoney.entity.Incoming;
import org.mjglezr.app.savemymoney.service.IncomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public class IncomingController<T extends Incoming, S extends IncomingService<T>> implements IIncomingController<T>{

    @Autowired
    private S service;

    @PutMapping("/save/{incoming}")
    @Override
    public T saveIncoming(@PathVariable T incoming) {
        return service.save(incoming);
    }

    @GetMapping("/findall")
    @Override
    public List<T> findAll() {
        return Lists.newArrayList(
                service.findAll());
    }
}
