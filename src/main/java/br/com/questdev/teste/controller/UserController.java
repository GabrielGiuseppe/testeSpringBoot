package br.com.questdev.teste.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String getUser(){
        return "Chupa Odontofuck";
    }
    @PostMapping
    public String createUser(){
        return "Retorno do metodo getUser - HTTP POST";
    }
    @PutMapping
    public String updateUser(){
        return "Retorno do metodo getUser - HTTP PUT";
    }
    @DeleteMapping
    public String deletaUser(){
        return "Retorno do metodo getUser - HTTP DELETE";
    }

}
