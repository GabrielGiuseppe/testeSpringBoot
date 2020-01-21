package br.com.questdev.teste.controller;

import br.com.questdev.teste.busines.ResultadoLoteriaBo;
import br.com.questdev.teste.model.entities.LoteriaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loteria")
@Slf4j
public class LoteriaController {

    @Autowired
    ResultadoLoteriaBo resultadoLoteriaBo;

    @PostMapping
    public ResponseEntity<LoteriaResponse> alimentarJogosLoteria(){
       LoteriaResponse loteriaResponse = resultadoLoteriaBo.alimentarJogosLoteria();
       return new ResponseEntity<LoteriaResponse>(loteriaResponse,HttpStatus.OK);
    }
 }
