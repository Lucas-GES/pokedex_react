package com.luck.pokedex.services;

import com.luck.pokedex.dto.RegionDTO;
import com.luck.pokedex.entities.Region;
import com.luck.pokedex.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionRepository repository;

    @Transactional(readOnly = true)
    public List<RegionDTO> findAll(){
        List<Region> pokes = repository.findAll();
        List<RegionDTO> result = pokes.stream().map(x -> new RegionDTO(x)).toList();
        return result;
    }

}
