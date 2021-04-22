package com.marcinblok.bookstore.catalog.application;

import com.marcinblok.bookstore.catalog.domain.Book;
import com.marcinblok.bookstore.catalog.domain.CatalogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CatalogController {

    private CatalogService service;

    public List<Book> findByTitle(String title) {
        return service.findByTitle(title);
    }
}
