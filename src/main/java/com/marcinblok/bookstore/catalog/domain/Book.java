package com.marcinblok.bookstore.catalog.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Book {
    private final Long id;
    private final String title;
    private final String author;
    private final int year;
}


