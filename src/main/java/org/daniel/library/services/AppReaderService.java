package org.daniel.library.services;

import lombok.AllArgsConstructor;
import org.daniel.library.data.models.Reader;
import org.daniel.library.data.repositories.ReaderRepository;
import org.daniel.library.dtos.request.CreateAccountRequest;
import org.daniel.library.dtos.response.CreateAccountResponse;
import org.daniel.library.dtos.response.GetReaderResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AppReaderService implements ReaderService{

    private final ReaderRepository readerRepository;

    @Override
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        Reader reader = new Reader();
        reader.setFullName(request.getFullName());
        reader.setUsername(request.getUsername());
        reader.setPassword(request.getPassword());
        Reader savedReader = readerRepository.save(reader);
        CreateAccountResponse response = new CreateAccountResponse();
        response.setFullName(savedReader.getFullName());
        response.setUsername(savedReader.getUsername());
        response.setPassword(savedReader.getPassword());
        response.setMessage("Account Registration Successful");
        return response;
    }

    @Override
    public GetReaderResponse findByUsername(String username) {
        Optional<Reader> optionalReader = readerRepository.findByUsername(username);
        if (optionalReader.isPresent()){
            GetReaderResponse response = new GetReaderResponse();
            Reader foundReader = optionalReader.get();
            response.setFullName(foundReader.getFullName());
            response.setUsername(foundReader.getUsername());
            response.setPassword(foundReader.getPassword());
            return response;
        }
        throw new RuntimeException(String.format("Reader With Username %s does not exist", username));
    }


}
