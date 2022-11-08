package borsoi.guilherme.dio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===== EXTRATO CONTA CORRENTE ====");
        imprimirInfos();
    }
}
