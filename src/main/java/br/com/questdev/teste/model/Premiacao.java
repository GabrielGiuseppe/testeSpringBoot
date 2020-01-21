package br.com.questdev.teste.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Premiacao {

    private String nome;
    private Integer quantidade_ganhadores;
    private Double valor_total;
    private Integer acertos;
}
