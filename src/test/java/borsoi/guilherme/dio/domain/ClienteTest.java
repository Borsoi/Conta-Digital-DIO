package borsoi.guilherme.dio.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClienteTest {

    @Test
    @DisplayName("Deve instaciar corretamente um objeto da classe Cliente sem o endereço preenchido")
    void deveInstanciarClasseClienteSemEnderecoCorretamente() {
        Cliente cliente = new Cliente("Cliente 1", LocalDate.of(2000, 1, 1));

        assertEquals("Cliente 1", cliente.getNome());
        assertEquals(LocalDate.of(2000, 1, 1), cliente.getDataNascimento());
        assertEquals(22, cliente.getIdade());
        assertNull(cliente.getEndereco());
    }

    @Test
    @DisplayName("Deve instaciar corretamente um objeto da classe Cliente com o endereço preenchido")
    void deveInstanciarClasseClienteComEnderecoCorretamente() {
        Endereco endereco = new Endereco("Rua das Papoulas", "58", "Bairro das Maravilhas", "José do Céu", "SP");
        Cliente cliente = new Cliente("Cliente 1", LocalDate.of(2000, 1, 1), endereco);

        assertEquals("Cliente 1", cliente.getNome());
        assertEquals(LocalDate.of(2000, 1, 1), cliente.getDataNascimento());
        assertEquals(22, cliente.getIdade());
        assertNotNull(cliente.getEndereco());
    }

}