package com.marcinblok.bookstore;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

//Klasa odpowiedzialna za to jakie mam książki dostępne w systemie, czyli jakie tytuły oferuje na sprzedaż moja księgarnia.
@Service  // Informuję tym Springa że to ma być Bean
public class CatalogService {

    //ConcurrentHashMap użyte by działo to w miarę bezpiecznie i wydajnie w środowisku współbieżnym.
    private final Map<Long, Book> storage = new ConcurrentHashMap<>();

    public CatalogService() {
        storage.put(1L, new Book(1L, "Pan Tadeusz", "Adam Mickiewicz", 1834));
        storage.put(2L, new Book(2L, "Ogniem i Mieczem", "Henryk Sienkiewicz", 1884));
        storage.put(3L, new Book(3L, "Chłopi", "Władysław Reymont", 1904));
    }

    List<Book> findByTitle(String title) {
        return storage.values()
                .stream()
                .filter(book -> book.title.startsWith(title))
                .collect(Collectors.toList());
    }
}
