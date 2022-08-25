package com.luck.pokedex.repositories;

import com.luck.pokedex.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
