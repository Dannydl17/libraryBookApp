package org.daniel.library.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.daniel.library.dtos.response.BookSearchResponse;
import org.daniel.library.dtos.response.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
@AllArgsConstructor
@Slf4j
public class AppSearchBookService implements SearchBookService{

    private RestTemplate restTemplate;

    @Override
    public Result searchBook(String bookName, String authorName) throws URISyntaxException {
        URI url = new URI("https://gutendex.com/books?search=" + bookName);
        ResponseEntity<BookSearchResponse> response = restTemplate.getForEntity(url, BookSearchResponse.class);
//        System.out.println(response.getBody());
//        log.info(String.valueOf(response.getBody()));
//        BookSearchResponse mainResponseBody = response.getBody();
        return response.getBody().getResults().get(0);
    }
}
