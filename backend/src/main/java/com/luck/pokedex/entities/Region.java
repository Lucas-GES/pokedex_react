package com.luck.pokedex.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String nome;

    @OneToMany(mappedBy = "region")
    @JsonIgnore
    private List<Pokemon> pokemons;

    public Region() {
    }

    public Region(Long id, String image, String nome) {
        this.id = id;
        this.image = image;
        this.nome = nome;
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

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return id.equals(region.id) && image.equals(region.image) && nome.equals(region.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, nome);
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + nome + '\'' +
                '}';
    }
}
