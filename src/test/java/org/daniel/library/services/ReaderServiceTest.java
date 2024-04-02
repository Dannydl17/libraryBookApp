package org.daniel.library.services;

import org.daniel.library.dtos.request.CreateAccountRequest;
import org.daniel.library.dtos.response.CreateAccountResponse;
import org.daniel.library.dtos.response.GetReaderResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReaderServiceTest {

    @Autowired
    private ReaderService readerService;

    @Test
    public void testThatReadersCanCreateAccount(){
        CreateAccountRequest request = new CreateAccountRequest();
        request.setFullName("Danny");
        request.setUsername("DannyBoy");
        request.setPassword("1234");
        CreateAccountResponse response = readerService.createAccount(request);
        assertThat(response).isNotNull();
        assertThat(response.getMessage()).isEqualTo("Account Registration Successful");
    }

    @Test
    public void testThatAfterReadersCreateAccount_ReaderExistsInDatabase(){
        assertDoesNotThrow(()->{
            CreateAccountRequest request = new CreateAccountRequest();
            request.setFullName("Abdulmalik");
            request.setUsername("Ayanniyi");
            request.setPassword("5678");
            CreateAccountResponse response = readerService.createAccount(request);
            GetReaderResponse getReaderResponse = readerService.findByUsername(response.getUsername());
            assertThat(getReaderResponse).isNotNull();
        });
    }


}