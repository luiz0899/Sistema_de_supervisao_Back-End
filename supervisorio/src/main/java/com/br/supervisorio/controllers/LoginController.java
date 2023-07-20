package com.br.supervisorio.controllers;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.repositories.LoginRepository;
import com.br.supervisorio.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/login")
@CrossOrigin(origins = "*")
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/autenticar")
    public List<Login> auntenticar(@RequestBody Login login){
        List<Login> u = loginService.findByEmailAndPasswordIgnoreCase(login.getEmail(),login.getPassword());
        return u;
    }

}
