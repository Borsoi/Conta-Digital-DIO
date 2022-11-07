package borsoi.guilherme.dio;

import borsoi.guilherme.dio.domain.ContaCorrente;
import borsoi.guilherme.dio.domain.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        System.out.println(contaCorrente.getAgencia());
        System.out.println(contaCorrente.getNumero());

        System.out.println(contaPoupanca.getAgencia());
        System.out.println(contaPoupanca.getNumero());

    }
}
