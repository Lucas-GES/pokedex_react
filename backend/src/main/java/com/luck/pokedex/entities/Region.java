package com.luck.pokedex.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
    private String name;

    @OneToMany(mappedBy = "region")
    private List<Pokemon> pokemons;

    public Region() {
    }

    public Region(Long id, String img, String name) {
        this.id = id;
        this.img = img;
        this.name = name;
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

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return id.equals(region.id) && img.equals(region.img) && name.equals(region.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, img, name);
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
