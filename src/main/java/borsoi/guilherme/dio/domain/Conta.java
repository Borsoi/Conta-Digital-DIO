package borsoi.guilherme.dio.domain;

import borsoi.guilherme.dio.client.IConta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Conta implements IConta {

    private static final String AGENCIA_PADRAO = "36616-2";

    private static int sequencialNumero = 1;

    private int numero;
    private String agencia;
    private BigDecimal saldo;

    public Conta() {
        this.setAgencia(Conta.AGENCIA_PADRAO);
        this.setNumero(sequencialNumero++);
    }

    @Override
    public void depositar(BigDecimal valorDeposito) {

    }

    @Override
    public void sacar(BigDecimal valorSaque) {

    }

    @Override
    public void transferir(String contaOrigem, String contaDestino, BigDecimal valorTransferencia) {

    }
}
