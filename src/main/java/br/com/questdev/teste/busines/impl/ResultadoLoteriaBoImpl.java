package br.com.questdev.teste.busines.impl;

import br.com.questdev.teste.busines.ResultadoLoteriaBo;
import br.com.questdev.teste.model.entities.LoteriaResponse;
import br.com.questdev.teste.repository.Loteria;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ResultadoLoteriaBoImpl implements ResultadoLoteriaBo {

    @Value(value = "${api.loterias.token}")
    private String loteriaToken;

    @Autowired
    Loteria loteria;

    @Override
    public LoteriaResponse alimentarJogosLoteria() {

        return loteria.getLoteriaJogo("megasena", loteriaToken, "2220");

    }
}
