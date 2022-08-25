package com.luck.pokedex.services;

import com.luck.pokedex.dto.PokemonDTO;
import com.luck.pokedex.entities.Pokemon;
import com.luck.pokedex.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository repository;

    @Transactional(readOnly = true)
    public List<PokemonDTO> findAll(){
        List<Pokemon> pokes = repository.findAll();
        List<PokemonDTO> result = pokes.stream().map(x -> new PokemonDTO(x)).toList();
        return result;
    }

    @Transactional(readOnly = true)
    public List<PokemonDTO> findByRegion(Long id){
        List<Pokemon> pokes = repository.findAll().stream().filter(x -> x.getRegion().getId() == id).toList();
        List<PokemonDTO> result = pokes.stream().map(x -> new PokemonDTO(x)).toList();
        return result;
    }
}
