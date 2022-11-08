package borsoi.guilherme.dio.domain;

import borsoi.guilherme.dio.client.IConta;
import borsoi.guilherme.dio.exception.SaldoInsuficienteException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Conta implements IConta {

    private static final String AGENCIA_PADRAO = "36616-2";

    private static int sequencialNumero = 1;

    private int numero;
    private String agencia;
    private BigDecimal saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.setAgencia(Conta.AGENCIA_PADRAO);
        this.setNumero(sequencialNumero++);
        this.saldo = BigDecimal.ZERO;
        this.cliente = cliente;
    }

    @Override
    public void depositar(BigDecimal valorDeposito) {
        setSaldo(saldo.add(valorDeposito));
    }

    @Override
    public void sacar(BigDecimal valorSaque) {
        if (valorSaque.compareTo(saldo) > 0) {
            throw new SaldoInsuficienteException(saldo, valorSaque);
        }
        setSaldo(saldo.subtract(valorSaque));
    }

    @Override
    public void transferir(Conta contaDestino, BigDecimal valorTransferencia) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

    protected void imprimirInfos() {
        System.out.printf("Agência: %s%n", getAgencia());
        System.out.printf("Conta: %s%n", getNumero());
        System.out.printf("Saldo: %s%n", getSaldo());
        System.out.printf("Cliente: %s%n", getCliente().getNome() + '\n');
    }
}
