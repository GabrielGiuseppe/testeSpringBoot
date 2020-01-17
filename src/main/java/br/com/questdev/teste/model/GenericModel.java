package br.com.questdev.teste.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class GenericModel extends BaseDomain{

    private static final long serialVersionUID = 122490434991759475L;

    private String nome;
    private String email;
}
