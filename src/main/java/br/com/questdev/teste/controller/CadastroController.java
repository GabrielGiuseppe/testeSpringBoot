package br.com.questdev.teste.controller;

import br.com.questdev.teste.busines.CadastroBo;
import br.com.questdev.teste.model.Cliente;
import br.com.questdev.teste.model.entities.CadastroRequest;
import br.com.questdev.teste.model.entities.CadastroResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cadastro")
@Slf4j
public class CadastroController {

    @Autowired
    CadastroBo cadastroBo;

    @PostMapping
    public ResponseEntity<CadastroResponse> addUser(@RequestBody Cliente cliente){
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(cliente);
        CadastroRequest cadastroRequest = CadastroRequest.builder().listaCliente(listaCliente).build();

        CadastroResponse cadastroResponse = cadastroBo.efetuarCadastroCliente(cadastroRequest);
        return new ResponseEntity<CadastroResponse>(cadastroResponse, HttpStatus.OK);
    }

    @PostMapping(value = "/pacote")
    public ResponseEntity<CadastroResponse> addUserInPackages(@RequestBody CadastroRequest cadastroRequest){

        CadastroResponse cadastroResponse = cadastroBo.efetuarCadastroCliente(cadastroRequest);
        return new ResponseEntity<CadastroResponse>(cadastroResponse, HttpStatus.OK);

    }
}
