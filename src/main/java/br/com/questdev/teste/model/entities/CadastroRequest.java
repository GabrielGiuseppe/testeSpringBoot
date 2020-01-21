package br.com.questdev.teste.model.entities;

import br.com.questdev.teste.model.Cliente;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CadastroRequest {
        private List<Cliente> listaCliente;
}
