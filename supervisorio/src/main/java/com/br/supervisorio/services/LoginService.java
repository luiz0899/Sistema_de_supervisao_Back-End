package com.br.supervisorio.services;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.repositories.LoginRepository;
import com.br.supervisorio.services.exceptions.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;

    public List<Login> findByEmailAndPasswordIgnoreCase(String email, String password) {
        List<Login> list = loginRepository.findByEmailAndPasswordIgnoreCase(email, password);
        if (list == null || list.size() == 0) {
            throw new EntityNotFoundException("The  entity " + email + " was not found!");
        }else {
            return list;
        }
    }
}
