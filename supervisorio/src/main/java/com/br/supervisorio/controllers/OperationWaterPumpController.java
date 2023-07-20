package com.br.supervisorio.controllers;

import com.br.supervisorio.entities.OperationWaterPump;
import com.br.supervisorio.entities.WaterLevel;
import com.br.supervisorio.services.OperationWaterPumpService;
import com.br.supervisorio.services.WaterLevelService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.RequiredArgsConstructor;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/operation_water_pump")
@CrossOrigin(origins = "*")
public class OperationWaterPumpController {

    private final OperationWaterPumpService operationWaterPumpService;

    @GetMapping("/{id}")
    public ResponseEntity<OperationWaterPump> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(operationWaterPumpService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<OperationWaterPump>> findAll() {
        return ResponseEntity.ok().body(operationWaterPumpService.findAll());
    }

    @PostMapping
    public ResponseEntity<OperationWaterPump> register(@RequestBody OperationWaterPump operationWaterPump) {
        return ResponseEntity.ok().body(operationWaterPumpService.register(operationWaterPump));
    }

    @PutMapping("/manual/{id}")
    public ResponseEntity<OperationWaterPump> updateManual(@PathVariable Long id, @RequestBody JsonNode newManualValue) {
        boolean manualValue = newManualValue.get("manual").asBoolean();
        OperationWaterPump operationWaterPump = operationWaterPumpService.updateManualValue(id, manualValue);
        return ResponseEntity.ok().body(operationWaterPump);
    }

    @PutMapping("/solenoid/{id}")
    public ResponseEntity<OperationWaterPump> updateSolenoid(@PathVariable Long id, @RequestBody JsonNode newSolenoidValue) {
        boolean solenoidValue = newSolenoidValue.get("solenoid").asBoolean();
        OperationWaterPump operationWaterPump = operationWaterPumpService.updateSolenoidValue(id, solenoidValue);
        return ResponseEntity.ok().body(operationWaterPump);
    }

    @PutMapping("/water_pump/{id}")
    public ResponseEntity<OperationWaterPump> updateWaterPump(@PathVariable Long id, @RequestBody JsonNode newWaterPumpValue) {
        boolean waterPumpValue = newWaterPumpValue.get("water_pump").asBoolean();
        OperationWaterPump operationWaterPump = operationWaterPumpService.updateWaterPumpValue(id, waterPumpValue);
        return ResponseEntity.ok().body(operationWaterPump);
    }
}
