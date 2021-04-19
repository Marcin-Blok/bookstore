package com.marcinblok.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


// Interfejs CommandLineRunner dostarcza metodę która uruchomi się gdy "wstanie" kontekst Spring-a a
// wszystko co jest wewnątrz metody run() zostanie uruchomione.
@SpringBootApplication
public class BookstoreAplicationServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAplicationServiceApplication.class, args);
	}

	private final CatalogService catalogService;

	public BookstoreAplicationServiceApplication(CatalogService catalogService) {
		this.catalogService = catalogService;
	}

	@Override
	public void run(String... args) throws Exception {
		// Normalnie tworzyłbym instancję CatalogService catalogService = new CatalogService();,
		// ale dzięki Springowi nie muszę i dlatego zakomentuję ten kod a Spring za mnie to zrobi
		// poprzez wstrzykiwanie zależności poprzez konstruktor.
		// CatalogService catalogService = new CatalogService(); i pozostaje tylko wywołać metodę findByTitle()
		List<Book> books = catalogService.findByTitle("Pan Tadeusz");
		books.forEach(System.out::println);
	}
}
