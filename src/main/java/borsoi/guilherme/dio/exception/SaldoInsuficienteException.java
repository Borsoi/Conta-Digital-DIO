package borsoi.guilherme.dio.exception;

import java.math.BigDecimal;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(BigDecimal saldo, BigDecimal valor) {
        super(String.format("O valor desejado de R$%s é superior ao saldo disponível de R$%s", valor, saldo));
    }
}
