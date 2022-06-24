package com.example.heroku_test.controller;

import com.example.heroku_test.model.Sentenca;
import com.example.heroku_test.repository.SentencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/rest-api")
public class RestController {
    @Autowired
    private SentencaRepository sentencaRepository;

    @GetMapping("/sentenca")
    public List<Sentenca> listar() {
        return sentencaRepository.findAll();
    }

    @GetMapping("/sentenca/{id}")
    public Optional<Sentenca> tipoProduto(@PathVariable Long id) {
        return sentencaRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sentenca add(@RequestBody Sentenca sentenca) {
        return sentencaRepository.save(sentenca);
    }

}
