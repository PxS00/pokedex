package br.com.fiap.dao;

import java.util.ArrayList;

public class PokemonDAO {
    public ArrayList<br.com.fiap.to.PokemonTO> findAll(){
        ArrayList<br.com.fiap.to.PokemonTO> pokemons = new ArrayList<>();
        pokemons.add(new br.com.fiap.to.PokemonTO(1L, "Pikachu", 0.4, 6.0, "Elétrico", java.time.LocalDate.parse("2023-10-10")));
        pokemons.add(new br.com.fiap.to.PokemonTO(2L, "Bulbasaur", 0.7, 6.9, "Planta/Venenoso", java.time.LocalDate.parse("2022-04-01")));
        pokemons.add(new br.com.fiap.to.PokemonTO(3L, "Charmander", 0.6, 8.5, "Fogo", java.time.LocalDate.parse("2021-12-25")));
        pokemons.add(new br.com.fiap.to.PokemonTO(4L, "Squirtle", 0.5, 9.0, "Água", java.time.LocalDate.parse("2020-07-15")));
        pokemons.add(new br.com.fiap.to.PokemonTO(5L, "Jigglypuff", 0.5, 5.5, "Normal/Fada", java.time.LocalDate.parse("2019-03-08")));
        pokemons.add(new br.com.fiap.to.PokemonTO(6L, "Gengar", 1.5, 40.5, "Fantasma/Venenoso", java.time.LocalDate.parse("2018-10-31")));
        pokemons.add(new br.com.fiap.to.PokemonTO(7L, "Eevee", 0.3, 6.5, "Normal", java.time.LocalDate.parse("2022-11-20")));
        pokemons.add(new br.com.fiap.to.PokemonTO(8L, "Snorlax", 2.1, 460.0, "Normal", java.time.LocalDate.parse("2020-01-01")));
        pokemons.add(new br.com.fiap.to.PokemonTO(9L, "Mewtwo", 2.0, 122.0, "Psíquico", java.time.LocalDate.parse("2022-05-15")));
        pokemons.add(new br.com.fiap.to.PokemonTO(10L, "Mew", 0.4, 4.0, "Psíquico", java.time.LocalDate.parse("2022-05-16")));
        pokemons.add(new br.com.fiap.to.PokemonTO(11L, "Chikorita", 0.9, 6.4, "Planta", java.time.LocalDate.parse("2021-09-07")));
        pokemons.add(new br.com.fiap.to.PokemonTO(12L, "Cyndaquil", 0.5, 7.9, "Fogo", java.time.LocalDate.parse("2023-06-12")));
        pokemons.add(new br.com.fiap.to.PokemonTO(13L, "Totodile", 0.6, 9.5, "Água", java.time.LocalDate.parse("2022-02-14")));
        pokemons.add(new br.com.fiap.to.PokemonTO(14L, "Ampharos", 1.4, 61.5, "Elétrico", java.time.LocalDate.parse("2020-08-30")));
        pokemons.add(new br.com.fiap.to.PokemonTO(15L, "Umbreon", 1.0, 27.0, "Noturno", java.time.LocalDate.parse("2019-12-31")));
        pokemons.add(new br.com.fiap.to.PokemonTO(16L, "Espeon", 0.9, 26.5, "Psíquico", java.time.LocalDate.parse("2021-01-15")));
        pokemons.add(new br.com.fiap.to.PokemonTO(17L, "Treecko", 0.5, 5.0, "Planta", java.time.LocalDate.parse("2023-05-05")));
        pokemons.add(new br.com.fiap.to.PokemonTO(18L, "Torchic", 0.4, 2.5, "Fogo", java.time.LocalDate.parse("2022-10-12")));
        pokemons.add(new br.com.fiap.to.PokemonTO(19L, "Mudkip", 0.4, 7.6, "Água", java.time.LocalDate.parse("2020-04-22")));
        pokemons.add(new br.com.fiap.to.PokemonTO(20L, "Gardevoir", 1.6, 48.4, "Psíquico/Fada", java.time.LocalDate.parse("2021-03-17")));
        pokemons.add(new br.com.fiap.to.PokemonTO(21L, "Metagross", 1.6, 550.0, "Aço/Psíquico", java.time.LocalDate.parse("2023-09-10")));
        pokemons.add(new br.com.fiap.to.PokemonTO(22L, "Turtwig", 0.4, 10.2, "Planta", java.time.LocalDate.parse("2022-06-01")));
        pokemons.add(new br.com.fiap.to.PokemonTO(23L, "Chimchar", 0.5, 6.2, "Fogo", java.time.LocalDate.parse("2021-11-11")));
        pokemons.add(new br.com.fiap.to.PokemonTO(24L, "Piplup", 0.4, 5.2, "Água", java.time.LocalDate.parse("2020-02-29")));
        pokemons.add(new br.com.fiap.to.PokemonTO(25L, "Lucario", 1.2, 54.0, "Lutador/Aço", java.time.LocalDate.parse("2023-07-04")));
        pokemons.add(new br.com.fiap.to.PokemonTO(26L, "Garchomp", 1.9, 95.0, "Dragão/Terra", java.time.LocalDate.parse("2022-12-25")));
        pokemons.add(new br.com.fiap.to.PokemonTO(27L, "Snivy", 0.6, 8.1, "Planta", java.time.LocalDate.parse("2021-08-15")));
        pokemons.add(new br.com.fiap.to.PokemonTO(28L, "Tepig", 0.5, 9.9, "Fogo", java.time.LocalDate.parse("2020-05-01")));
        pokemons.add(new br.com.fiap.to.PokemonTO(29L, "Oshawott", 0.5, 5.9, "Água", java.time.LocalDate.parse("2023-10-12")));
        pokemons.add(new br.com.fiap.to.PokemonTO(30L, "Zoroark", 1.6, 81.1, "Noturno", java.time.LocalDate.parse("2022-09-30")));
        pokemons.add(new br.com.fiap.to.PokemonTO(31L, "Sylveon", 1.0, 23.5, "Fada", java.time.LocalDate.parse("2021-02-14")));
        pokemons.add(new br.com.fiap.to.PokemonTO(32L, "Greninja", 1.5, 40.0, "Água/Noturno", java.time.LocalDate.parse("2020-06-18")));
        pokemons.add(new br.com.fiap.to.PokemonTO(33L, "Decidueye", 1.6, 36.6, "Planta/Fantasma", java.time.LocalDate.parse("2023-03-01")));
        pokemons.add(new br.com.fiap.to.PokemonTO(34L, "Incineroar", 1.8, 83.0, "Fogo/Noturno", java.time.LocalDate.parse("2022-07-20")));
        pokemons.add(new br.com.fiap.to.PokemonTO(35L, "Primarina", 1.8, 44.0, "Água/Fada", java.time.LocalDate.parse("2021-12-31")));
        pokemons.add(new br.com.fiap.to.PokemonTO(36L, "Zacian", 2.8, 110.0, "Fada/Aço", java.time.LocalDate.parse("2024-01-01")));
        pokemons.add(new br.com.fiap.to.PokemonTO(37L, "Dragapult", 3.0, 50.0, "Dragão/Fantasma", java.time.LocalDate.parse("2023-08-08")));
        pokemons.add(new br.com.fiap.to.PokemonTO(38L, "Cinderace", 1.4, 33.0, "Fogo", java.time.LocalDate.parse("2022-05-05")));
        pokemons.add(new br.com.fiap.to.PokemonTO(39L, "Rillaboom", 2.1, 90.0, "Planta", java.time.LocalDate.parse("2021-04-21")));
        pokemons.add(new br.com.fiap.to.PokemonTO(40L, "Inteleon", 1.9, 45.2, "Água", java.time.LocalDate.parse("2020-09-09")));
        return pokemons;
    };
}
