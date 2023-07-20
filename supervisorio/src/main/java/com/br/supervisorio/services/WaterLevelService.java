package com.br.supervisorio.services;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.entities.WaterLevel;
import com.br.supervisorio.repositories.LoginRepository;
import com.br.supervisorio.repositories.WaterLevelRepository;
import com.br.supervisorio.services.exceptions.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WaterLevelService {

    private final WaterLevelRepository waterLevelRepository;

    public WaterLevel findById(Long id) {
        return waterLevelRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("The id " + id + " was not found!"));
    }

    public List<WaterLevel> findAll() {
        return waterLevelRepository.findAll();
    }

    public WaterLevel register(WaterLevel waterLevel) {
        return waterLevelRepository.save(waterLevel);
    }

    public WaterLevel update( WaterLevel waterLevel) {
        return waterLevelRepository.save(waterLevel);
    }
}
