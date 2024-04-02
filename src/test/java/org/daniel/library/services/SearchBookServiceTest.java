package org.daniel.library.services;

import lombok.SneakyThrows;
import org.daniel.library.dtos.response.BookSearchResponse;
import org.daniel.library.dtos.response.Result;
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
        Result result = searchBookService.searchBook("Alice", "Chinua Achebe");
        System.out.println(result);
    }
}
