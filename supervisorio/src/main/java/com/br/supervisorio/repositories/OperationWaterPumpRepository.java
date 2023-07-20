package com.br.supervisorio.repositories;

import com.br.supervisorio.entities.OperationWaterPump;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationWaterPumpRepository extends JpaRepository<OperationWaterPump, Long> {

}
