package org.daniel.library.services;

import org.daniel.library.dtos.response.BookSearchResponse;
import org.daniel.library.dtos.response.Result;

import java.net.URISyntaxException;

public interface SearchBookService {
    Result searchBook(String bookName, String authorName) throws URISyntaxException;
}
