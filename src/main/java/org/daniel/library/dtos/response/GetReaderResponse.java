package org.daniel.library.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class GetReaderResponse {

    private String fullName;
    private String username;
    private String password;
    private List<GetBookResponse> readingList;
}
