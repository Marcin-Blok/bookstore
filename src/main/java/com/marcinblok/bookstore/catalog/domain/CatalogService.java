package com.marcinblok.bookstore.catalog.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//Klasa odpowiedzialna za to jakie mam książki dostępne w systemie, czyli jakie tytuły oferuje na sprzedaż moja księgarnia.
@Service  // Informuję tym Springa że to ma być Bean
@AllArgsConstructor
public class CatalogService {

    private CatalogRepository repository;

    public List<Book> findByTitle(String title) {
        return repository.findAll()
                .stream()
                .filter(book -> book.getTitle().startsWith(title))
                .collect(Collectors.toList());
    }
}
