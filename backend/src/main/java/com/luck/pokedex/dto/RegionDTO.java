package com.luck.pokedex.dto;

import com.luck.pokedex.entities.Pokemon;
import com.luck.pokedex.entities.Region;

import java.util.List;

public class RegionDTO {

    private Long id;
    private String img;
    private String name;
    private List<Pokemon> pokemonList;

    public RegionDTO() {
    }

    public RegionDTO(Long id, String img, String name) {
        this.id = id;
        this.img = img;
        this.name = name;
    }

    public RegionDTO(Region region) {
        this.id = region.getId();
        this.img = region.getImage();
        this.name = region.getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

}
