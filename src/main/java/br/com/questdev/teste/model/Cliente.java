package br.com.questdev.teste.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Cliente extends BaseDomain{

    private static final long serialVersionUID = 4554453058624839393L;
    private String nome;
    private String email;
}
