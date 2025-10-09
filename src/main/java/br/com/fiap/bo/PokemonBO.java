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

    public PokemonTO save(PokemonTO pokemon) {
        pokemonDAO = new PokemonDAO();
        // Lógica de negócio pode ser adicionada aqui
        if (pokemon.getDataDaCaptura().isBefore(LocalDate.now())) {
            return null;
        }
        return pokemonDAO.save(pokemon);
    }
}
