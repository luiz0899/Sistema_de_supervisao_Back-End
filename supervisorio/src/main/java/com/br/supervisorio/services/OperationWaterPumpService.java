package com.br.supervisorio.services;

import com.br.supervisorio.entities.OperationWaterPump;
import com.br.supervisorio.entities.WaterLevel;
import com.br.supervisorio.repositories.OperationWaterPumpRepository;
import com.br.supervisorio.repositories.WaterLevelRepository;
import com.br.supervisorio.services.exceptions.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationWaterPumpService {

    private final OperationWaterPumpRepository operationWaterPumpRepository;

    public OperationWaterPump findById(Long id) {
        return operationWaterPumpRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("The id " + id + " was not found!"));
    }

    public List<OperationWaterPump> findAll() {
        return operationWaterPumpRepository.findAll();
    }

    public OperationWaterPump register(OperationWaterPump operationWaterPump) {
        return operationWaterPumpRepository.save(operationWaterPump);
    }

    public OperationWaterPump updateManualValue(Long id, boolean newManualValue) {
        OperationWaterPump operationWaterPump = operationWaterPumpRepository.findById(id).get();
//                .orElseThrow(() -> new ResourceNotFoundException("OperationWaterPump not found with id: " + id));
        operationWaterPump.setManual(newManualValue);
        return operationWaterPumpRepository.save(operationWaterPump);
    }

    public OperationWaterPump updateSolenoidValue(Long id, boolean newSolenoidValue) {
        OperationWaterPump operationWaterPump = operationWaterPumpRepository.findById(id).get();
//                .orElseThrow(() -> new ResourceNotFoundException("OperationWaterPump not found with id: " + id));
        operationWaterPump.setSolenoid(newSolenoidValue);
        return operationWaterPumpRepository.save(operationWaterPump);
    }

    public OperationWaterPump updateWaterPumpValue(Long id, boolean newWaterPumpValue) {
        OperationWaterPump operationWaterPump = operationWaterPumpRepository.findById(id).get();
//                .orElseThrow(() -> new ResourceNotFoundException("OperationWaterPump not found with id: " + id));
        operationWaterPump.setWaterPump(newWaterPumpValue);
        return operationWaterPumpRepository.save(operationWaterPump);
    }
}
