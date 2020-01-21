package br.com.questdev.teste.repository.impl;

import br.com.questdev.teste.model.Cliente;
import br.com.questdev.teste.repository.CadastroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CadastroDaoImpl implements CadastroDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int efetuarCadastroCliente(Cliente cliente) {
        StringBuffer query = new StringBuffer();
        query.append("INSERT INTO ");
        query.append("fornecedores ");
        query.append("( nome, ");
        query.append("email) ");
        query.append("VALUES ");
        query.append("( ?, ");
        query.append("?) ");

        return jdbcTemplate.update(query.toString(),
                cliente.getNome(),
                cliente.getEmail());
    }
}
