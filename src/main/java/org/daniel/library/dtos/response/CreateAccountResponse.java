package org.daniel.library.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateAccountResponse {

    private String fullName;
    private String username;
    private String password;
    private String message;
}
