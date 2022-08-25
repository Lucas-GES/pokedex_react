package com.luck.pokedex.repositories;

import com.luck.pokedex.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
