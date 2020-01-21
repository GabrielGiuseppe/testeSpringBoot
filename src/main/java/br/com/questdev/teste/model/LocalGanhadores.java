package br.com.questdev.teste.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class LocalGanhadores {

    private String local;
    private String cidade;
    private String uf;
    private Integer quantidade_ganhadores;
    private Boolean canal_eletronico;
}
