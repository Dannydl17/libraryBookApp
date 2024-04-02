package org.daniel.library.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reader {
    @Id
    @GeneratedValue(strategy = UUID)
    private String id;
    private String fullName;
    @Column(unique = true)
    private String username;
    private String password;
    @OneToMany
    @Column(name = "books")
    private List<Book> readingList;
}
