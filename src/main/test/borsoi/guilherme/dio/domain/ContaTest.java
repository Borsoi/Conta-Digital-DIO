package borsoi.guilherme.dio.domain;

import borsoi.guilherme.dio.exception.SaldoInsuficienteException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaTest {

    @Test
    @DisplayName("Deve conseguir depositar o valor com sucesso")
    void deveDepositarValorComSucesso() {
        ContaCorrente cc = gerarContaTeste();

        cc.depositar(BigDecimal.valueOf(1500.00));

        assertEquals(BigDecimal.valueOf(1500.00), cc.getSaldo());
    }

    @Test
    @DisplayName("Deve conseguir sacar com sucesso quando o saldo disponível for maior que o valor do saque")
    void deveSacarValorComSucesso() {
        ContaCorrente cc = gerarContaTeste();

        cc.depositar(BigDecimal.valueOf(1500.00));
        cc.sacar(BigDecimal.valueOf(1000.00));

        assertEquals(BigDecimal.valueOf(500.00), cc.getSaldo());
    }

    @Test
    @DisplayName("Deve gerar um exceção quando tentar sacar um valor maior do que o saldo disponível")
    void deveTentarSacarValorMaiorQueSaldo() {
        ContaCorrente cc = gerarContaTeste();

        cc.depositar(BigDecimal.valueOf(1500.00));

        assertThrows(SaldoInsuficienteException.class, () -> cc.sacar(BigDecimal.valueOf(2000.00)));
    }

    @Test
    void deveConseguirTransferirComSucesso() {
        ContaCorrente cc = gerarContaTeste();
        cc.depositar(BigDecimal.valueOf(1500.00));

        ContaPoupanca cp = new ContaPoupanca(new Cliente("Senhor das Estrelas", LocalDate.of(1975, 5, 30)));

        cc.transferir(cp, BigDecimal.valueOf(500));

        assertEquals(BigDecimal.valueOf(1000.00), cc.getSaldo());
        assertEquals(BigDecimal.valueOf(500), cp.getSaldo());
    }

    private static ContaCorrente gerarContaTeste() {
        return new ContaCorrente(new Cliente("Rogerinho", LocalDate.of(1980, 1, 26),
                new Endereco("Rua das Papoulas", "58", "Bairro das Maravilhas", "José do Céu", "SP")));
    }
}