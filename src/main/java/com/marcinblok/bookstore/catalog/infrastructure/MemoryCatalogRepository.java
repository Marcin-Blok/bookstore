package com.marcinblok.bookstore.catalog.infrastructure;

import com.marcinblok.bookstore.catalog.domain.Book;
import com.marcinblok.bookstore.catalog.domain.CatalogRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemoryCatalogRepository implements CatalogRepository {

    //ConcurrentHashMap użyte by działo to w miarę bezpiecznie i wydajnie w środowisku współbieżnym.
    private final Map<Long, Book> storage = new ConcurrentHashMap<>();

    public MemoryCatalogRepository() {
        storage.put(1L, new Book(1L, "Pan Tadeusz", "Adam Mickiewicz", 1834));
        storage.put(2L, new Book(2L, "Ogniem i Mieczem", "Henryk Sienkiewicz", 1884));
        storage.put(3L, new Book(3L, "Chłopi", "Władysław Reymont", 1904));
        storage.put(4L, new Book(4L, "Pan Wołodyjowski", "Henryk Sienkiewicz", 1988));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }
}
