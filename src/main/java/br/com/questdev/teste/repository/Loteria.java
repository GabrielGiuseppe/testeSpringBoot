package br.com.questdev.teste.repository;

import br.com.questdev.teste.model.entities.LoteriaResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/x-www-form-urlencoded")
public interface Loteria {


    @RequestLine("GET /app/resultado?loteria={loteria}&token={token}&concurso={concurso}")
    @Headers("Authorization: Basic {authorization}")
    LoteriaResponse getLoteriaJogo(
            @Param(value = "loteria") String loteria,
            @Param(value = "token") String token,
            @Param(value = "concurso") String concurso);
}
