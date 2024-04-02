package org.daniel.library.dtos.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookSearchRequest {
    private String title;
    private String author;
}
