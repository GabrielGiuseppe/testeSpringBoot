package br.com.questdev.teste.busines.impl;

import br.com.questdev.teste.busines.TesteBo;
import br.com.questdev.teste.model.GenericModel;
import br.com.questdev.teste.repository.TestSpringDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TesteBoImpl implements TesteBo {

    @Autowired
    TestSpringDao testSpringDao;

    @Override
    public List<GenericModel> retornarDados() {
        return testSpringDao.retornarDados();
    }
}
