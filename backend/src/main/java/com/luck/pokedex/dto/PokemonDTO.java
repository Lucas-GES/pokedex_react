package com.luck.pokedex.dto;

import com.luck.pokedex.entities.Pokemon;
import com.luck.pokedex.entities.Region;

public class PokemonDTO {

    private Long id;
    private String img;
    private String name;
    private String type;
    private Region region;

    public PokemonDTO() {
    }

    public PokemonDTO(Long id, String img, String name, String type, Region region) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.type = type;
        this.region = region;
    }

    public PokemonDTO(Pokemon pokemon){
        this.id = pokemon.getId();
        this.img = pokemon.getImage();
        this.name = pokemon.getNome();
        this.type = pokemon.getTipo();
        this.region = pokemon.getRegion();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
