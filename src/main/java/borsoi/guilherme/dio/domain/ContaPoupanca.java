package borsoi.guilherme.dio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===== EXTRATO CONTA POUPANÇA ====");
        imprimirInfos();
    }
}
