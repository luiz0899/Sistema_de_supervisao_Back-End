package com.br.supervisorio.repositories;

import com.br.supervisorio.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    List<Login> findByEmailAndPasswordIgnoreCase(String email, String password);
}
