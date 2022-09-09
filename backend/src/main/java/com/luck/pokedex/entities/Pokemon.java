package com.luck.pokedex.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String nome;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    public Pokemon() {
    }

    public Pokemon(Long id, String image, String nome, String tipo, Region region) {
        this.id = id;
        this.image = image;
        this.nome = nome;
        this.tipo = tipo;
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setimage(String image) {
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public Region getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id.equals(pokemon.id) && image.equals(pokemon.image) && nome.equals(pokemon.nome) && tipo.equals(pokemon.tipo) && region.equals(pokemon.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, nome, tipo, region);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", region=" + region +
                '}';
    }
}
