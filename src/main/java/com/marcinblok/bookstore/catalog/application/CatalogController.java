package com.marcinblok.bookstore.catalog.application;

import com.marcinblok.bookstore.catalog.domain.Book;
import com.marcinblok.bookstore.catalog.domain.CatalogService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CatalogController {
    private CatalogService service;

    public CatalogController(CatalogService service) {
        this.service = service;
    }

    public List<Book> findByTitle(String title){
        return service.findByTitle(title);
    }
}
