package org.daniel.library.services;

import org.daniel.library.dtos.response.BookSearchResponse;

import java.net.URISyntaxException;

public interface SearchBookService {

    BookSearchResponse searchBook(String bookName, String authorName) throws URISyntaxException;
}
