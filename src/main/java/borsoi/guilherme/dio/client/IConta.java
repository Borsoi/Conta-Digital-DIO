package borsoi.guilherme.dio.client;

import borsoi.guilherme.dio.domain.Conta;

import java.math.BigDecimal;

public interface IConta {

    void depositar(BigDecimal valorDeposito);

    void sacar(BigDecimal valorSaque);

    void transferir(Conta contaDestino, BigDecimal valorTransferencia);

    void imprimirExtrato();
}
