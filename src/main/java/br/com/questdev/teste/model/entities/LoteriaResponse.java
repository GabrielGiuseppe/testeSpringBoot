package br.com.questdev.teste.model.entities;

import br.com.questdev.teste.model.LocalGanhadores;
import br.com.questdev.teste.model.Premiacao;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class LoteriaResponse {

    private String nome;
    private Integer numero_concurso;
    private String data_concurso;
    private String data_concurso_milliseconds;
    private String local_realizacao;
    private Boolean rateio_processamento;
    private Boolean acumulou;
    private Double valor_acumulado;

    private List<Integer> dezenas;
    private List<Premiacao> premiacao;
    private List<LocalGanhadores> local_ganhadores;

    private Double arrecadacao_total;
    private Integer concurso_proximo;
    private String data_proximo_concurso;
    private Double data_proximo_concurso_milliseconds;
    private Double valor_estimado_proximo_concurso;
    private Double valor_final_concurso_acumulado;
    private Integer numero_final_concurso_acumulado;
    private Double valor_acumulado_especial;
    private String nome_acumulado_especial;
    private Boolean concurso_especial;
}

