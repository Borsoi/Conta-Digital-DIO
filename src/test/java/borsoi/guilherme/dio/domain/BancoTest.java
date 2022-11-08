package borsoi.guilherme.dio.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BancoTest {

    @Test
    @DisplayName("Deve instaciar corretamente um objeto da classe Banco")
    void deveInstanciarClasseBancoCorretamente() {
        Cliente cliente1 = new Cliente("Cliente 1", LocalDate.of(2000, 1, 1));
        Cliente cliente2 = new Cliente("Cliente 2", LocalDate.of(1950, 1, 1));
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cliente1);
        clienteList.add(cliente2);

        List<Conta> contaList = new ArrayList<>();
        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);
        contaList.add(contaCorrente);
        contaList.add(contaPoupanca);

        Banco banco = new Banco(contaList, clienteList);

        assertNotNull(banco.getClientes());
        assertNotNull(banco.getContas());
    }

}