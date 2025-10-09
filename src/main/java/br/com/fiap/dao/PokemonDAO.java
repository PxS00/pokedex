package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {

    public ArrayList<PokemonTO> findAll() {
        ArrayList<PokemonTO> pokemons = new ArrayList<>();

        PokemonTO p = new PokemonTO(1L, "Pikachu", 0.4, 6.0, "Elétrico", LocalDate.parse("2023-10-10"));
        pokemons.add(p);

        p = new PokemonTO(2L, "Bulbasaur", 0.7, 6.9, "Planta/Venenoso", LocalDate.parse("2022-04-01"));
        pokemons.add(p);
        p = new PokemonTO(21L, "Ivysaur", 1.0, 13.0, "Planta/Venenoso", LocalDate.parse("2022-05-01"));
        pokemons.add(p);
        p = new PokemonTO(22L, "Venusaur", 2.0, 100.0, "Planta/Venenoso", LocalDate.parse("2022-06-01"));
        pokemons.add(p);

        p = new PokemonTO(3L, "Charmander", 0.6, 8.5, "Fogo", LocalDate.now().minusYears(2));
        pokemons.add(p);
        p = new PokemonTO(31L, "Charmeleon", 1.1, 19.0, "Fogo", LocalDate.parse("2023-01-15"));
        pokemons.add(p);
        p = new PokemonTO(32L, "Charizard", 1.7, 90.5, "Fogo/Voador", LocalDate.parse("2023-02-20"));
        pokemons.add(p);

        p = new PokemonTO(4L, "Squirtle", 0.5, 9.0, "Água", LocalDate.parse("2020-07-15"));
        pokemons.add(p);
        p = new PokemonTO(41L, "Wartortle", 1.0, 22.5, "Água", LocalDate.parse("2020-08-10"));
        pokemons.add(p);
        p = new PokemonTO(42L, "Blastoise", 1.6, 85.5, "Água", LocalDate.parse("2020-09-05"));
        pokemons.add(p);

        return pokemons;
    }

    public PokemonTO save(PokemonTO pokemon){
        String sql = "insert into ddd_pokemos(nome, altura, peso, categoria, data_de_captura) values(?,?,?,?,?)";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql))
        {
            ps.setString(1, pokemon.getNome());
            ps.setDouble(2, pokemon.getAltura());
            ps.setDouble(3, pokemon.getPeso());
            ps.setString(4, pokemon.getCategoria());
            ps.setDate(5, Date.valueOf(pokemon.getDataDaCaptura()));
            if (ps.executeUpdate() > 0){
                return pokemon;
            }else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao Salvar: " + e.getMessage());
        }finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }
}