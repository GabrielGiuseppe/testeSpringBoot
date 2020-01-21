package br.com.questdev.teste.repository;

import br.com.questdev.teste.model.Cliente;
import br.com.questdev.teste.model.entities.CadastroRequest;

public interface CadastroDao {

    public int efetuarCadastroCliente(Cliente cliente);
}
