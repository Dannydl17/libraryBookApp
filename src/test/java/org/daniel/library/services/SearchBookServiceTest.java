package org.daniel.library.services;

import lombok.SneakyThrows;
import org.daniel.library.dtos.response.BookSearchResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchBookServiceTest {

    @Autowired
    private SearchBookService searchBookService;

    @Test
    @SneakyThrows
    public void searchBookTest(){
        BookSearchResponse response = searchBookService.searchBook("A%20Room%20with%20a%20View", "Chinua Achebe");
        System.out.println(response);
    }
}
