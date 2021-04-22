package com.marcinblok.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Interfejs CommandLineRunner dostarcza metodę która uruchomi się gdy "wstanie" kontekst Spring-a a
// wszystko co jest wewnątrz metody run() zostanie uruchomione.
@SpringBootApplication
public class BookstoreAplicationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreAplicationServiceApplication.class, args);
    }
}
