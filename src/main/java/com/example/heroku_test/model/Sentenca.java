package com.example.heroku_test.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Sentenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_sentenca", length = 25, nullable = false)
    private String nomeSentenca;
}
