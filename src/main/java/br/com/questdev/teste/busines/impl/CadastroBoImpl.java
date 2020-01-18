package br.com.questdev.teste.busines.impl;

import br.com.questdev.teste.busines.CadastroBo;
import br.com.questdev.teste.model.Cliente;
import br.com.questdev.teste.model.entities.CadastroRequest;
import br.com.questdev.teste.model.entities.CadastroResponse;
import br.com.questdev.teste.repository.CadastroDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CadastroBoImpl implements CadastroBo {

    @Autowired
    CadastroDao cadastroDao;


    @Override
    public CadastroResponse efetuarCadastroCliente(CadastroRequest cadastroRequest) {
        int contador = 0;
        for (Cliente cliente : cadastroRequest.getListaCliente()){
            contador += cadastroDao.efetuarCadastroCliente(cliente);
        }
        return CadastroResponse.builder().mensagem(Integer.toString(contador) + " Usuarios cadastrados com sucesso!").build();
    }
}
