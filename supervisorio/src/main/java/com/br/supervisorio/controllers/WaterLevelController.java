package com.br.supervisorio.controllers;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.entities.WaterLevel;
import com.br.supervisorio.services.LoginService;
import com.br.supervisorio.services.WaterLevelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/water_level")
@CrossOrigin(origins = "*")
public class WaterLevelController {

    private final WaterLevelService waterLevelService;

    @GetMapping("/{id}")
    public ResponseEntity<WaterLevel> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(waterLevelService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<WaterLevel>> findAll() {
        return ResponseEntity.ok().body(waterLevelService.findAll());
    }

    @PostMapping
    public ResponseEntity<WaterLevel> register(@RequestBody WaterLevel waterLevel) {
        return ResponseEntity.ok().body(waterLevelService.register(waterLevel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WaterLevel> update(@RequestBody WaterLevel waterLevel) {
        return ResponseEntity.ok().body(waterLevelService.update(waterLevel));
    }

}
