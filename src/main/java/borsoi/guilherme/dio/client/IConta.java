package borsoi.guilherme.dio.client;

import java.math.BigDecimal;

public interface IConta {

    void depositar(BigDecimal valorDeposito);

    void sacar(BigDecimal valorSaque);

    void transferir(String contaOrigem, String contaDestino, BigDecimal valorTransferencia);
}
