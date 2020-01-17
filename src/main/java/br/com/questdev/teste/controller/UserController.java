package br.com.questdev.teste.controller;


import br.com.questdev.teste.busines.TesteBo;
import br.com.questdev.teste.model.GenericModel;
import br.com.questdev.teste.model.TesteResponse;
import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    TesteBo testeBo;

    @GetMapping
    public ResponseEntity<TesteResponse> getUser(){

        TesteResponse testeResponse = TesteResponse.builder().entidades(testeBo.retornarDados()).build();
        return new ResponseEntity<TesteResponse>(testeResponse, HttpStatus.OK);
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
