package com.br.supervisorio.repositories;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.entities.WaterLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterLevelRepository extends JpaRepository<WaterLevel, Long> {

}
