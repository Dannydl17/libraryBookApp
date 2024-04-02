package org.daniel.library.services;

import org.daniel.library.dtos.request.CreateAccountRequest;
import org.daniel.library.dtos.response.CreateAccountResponse;
import org.daniel.library.dtos.response.GetReaderResponse;

public interface ReaderService {

    CreateAccountResponse createAccount(CreateAccountRequest request);

    GetReaderResponse findByUsername(String username);
}
