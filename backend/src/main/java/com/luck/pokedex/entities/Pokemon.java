package com.luck.pokedex.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
    private String name;
    private String type;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    public Pokemon() {
    }

    public Pokemon(Long id, String img, String name, String type, Region region) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.type = type;
        this.region = region;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id.equals(pokemon.id) && img.equals(pokemon.img) && name.equals(pokemon.name) && type.equals(pokemon.type) && region.equals(pokemon.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, img, name, type, region);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", region=" + region +
                '}';
    }
}
