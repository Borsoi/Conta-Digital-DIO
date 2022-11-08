package borsoi.guilherme.dio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Banco {

    List<Conta> contas;
    List<Cliente> clientes;

    public void exibirClientes() {
        System.out.println("=== LISTA CLIENTES ===");
        System.out.println(Arrays.toString(clientes.toArray()));
        System.out.println();
    }

    public void exibirContas() {
        System.out.println("=== LISTA CONTAS ===");
        System.out.println(contas);
        System.out.println();
    }
}
