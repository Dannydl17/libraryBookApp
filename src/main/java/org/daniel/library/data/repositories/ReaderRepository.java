package org.daniel.library.data.repositories;

import org.daniel.library.data.models.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, String> {
     Optional<Reader> findByUsername(String username);
}
