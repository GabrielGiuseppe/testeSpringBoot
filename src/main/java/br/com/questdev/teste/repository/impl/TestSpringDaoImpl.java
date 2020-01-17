package br.com.questdev.teste.repository.impl;

import br.com.questdev.teste.model.GenericModel;
import br.com.questdev.teste.repository.TestSpringDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestSpringDaoImpl implements TestSpringDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<GenericModel> retornarDados() {

        StringBuffer query = new StringBuffer();
        query.append("Select nome, email from fornecedores");

        List<GenericModel> result = jdbcTemplate.query(query.toString(),
                new Object[]{},
                (rs, rowNum) ->
                        new GenericModel(
                                rs.getString("nome"),
                                rs.getString("email")));
        return result;
    }
}
