package br.com.questdev.teste.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class TesteResponse extends BaseDomain {
    private static final long serialVersionUID = -8782948417199361940L;

    private List<GenericModel> entidades;

}
