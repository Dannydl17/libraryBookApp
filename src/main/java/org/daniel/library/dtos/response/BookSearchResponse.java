package org.daniel.library.dtos.response;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookSearchResponse {
    private String message;
    private int count;
    private String next;
    private Object previous;
    private List<Result> results;
}
