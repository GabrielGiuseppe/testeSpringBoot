package br.com.questdev.teste.busines;

import br.com.questdev.teste.model.entities.CadastroRequest;
import br.com.questdev.teste.model.entities.CadastroResponse;

public interface CadastroBo {

    public CadastroResponse efetuarCadastroCliente(CadastroRequest cadastroRequest);
}
