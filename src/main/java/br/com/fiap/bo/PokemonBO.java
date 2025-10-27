package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonBO {
    private PokemonDAO pokemonDAO;

    public ArrayList<PokemonTO>findAll(){
        pokemonDAO = new PokemonDAO();
        // Lógica de negócio pode ser adicionada aqui
        return pokemonDAO.findAll();
    }

    public PokemonTO findByCodigo(Long codigo){
        pokemonDAO = new PokemonDAO();
        // Lógica de negócio pode ser adicionada aqui
        return pokemonDAO.findByCodigo(codigo);
    }

    public PokemonTO save(PokemonTO pokemon) {
        // Lógica de negócio pode ser adicionada aqui
        return pokemonDAO.save(pokemon);
    }
    public boolean delete(Long codigo){
        pokemonDAO = new PokemonDAO();
        // Lógica de negócio pode ser adicionada aqui
        return pokemonDAO.delete(codigo);
    }

    public PokemonTO update(PokemonTO pokemon){
        pokemonDAO = new PokemonDAO();
        // Lógica de negócio pode ser adicionada aqui
        return pokemonDAO.update(pokemon);
    }
}
