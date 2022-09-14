package com.luck.pokedex.controllers;

import com.luck.pokedex.dto.PokemonDTO;
import com.luck.pokedex.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public List<PokemonDTO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public List<PokemonDTO> findByRegion(@PathVariable Long id){
        return service.findByRegion(id);
    }

}
