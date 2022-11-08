package borsoi.guilherme.dio;

import borsoi.guilherme.dio.domain.*;
import borsoi.guilherme.dio.exception.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Catriona Winter", LocalDate.of(1997, 4, 20 ));
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        contaCorrente.depositar(BigDecimal.valueOf(150.0));
        contaPoupanca.depositar(BigDecimal.valueOf(10.0));

        contaCorrente.transferir(contaPoupanca, BigDecimal.valueOf(50));
        contaCorrente.sacar(BigDecimal.valueOf(10));

        try {
            contaCorrente.sacar(BigDecimal.valueOf(1500));
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        Banco banco = new Banco(contas, clientes);
        banco.exibirClientes();
        banco.exibirContas();

    }
}
