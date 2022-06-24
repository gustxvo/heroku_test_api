package com.example.heroku_test.repository;

import com.example.heroku_test.model.Sentenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SentencaRepository extends JpaRepository<Sentenca, Long> {

    Optional<Sentenca> findById(Long id);
}
