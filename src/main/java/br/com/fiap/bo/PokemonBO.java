package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

import java.util.ArrayList;

public class PokemonBO {
    private PokemonDAO pokemonDAO;

    public ArrayList<PokemonTO>findAll(){
        pokemonDAO = new PokemonDAO();
        // Lógica de negócio pode ser adicionada aqui
        return pokemonDAO.findAll();
    }
}
