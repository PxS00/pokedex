package br.com.fiap.to;

import java.time.LocalDate;

public class PokemonTO {
    private Long codigo;
    private String nome;
    private Double altura;
    private Double peso;
    private String categoria;
    private LocalDate dataDaCaptura;

    public PokemonTO() {
    }

    public PokemonTO(Long codigo, String nome, Double altura, Double peso, String categoria, LocalDate dataDaCaptura) {
        this.codigo = codigo;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.dataDaCaptura = dataDaCaptura;
    }

}
