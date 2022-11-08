package borsoi.guilherme.dio.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnderecoTest {

    @Test
    @DisplayName("Deve instaciar corretamente um objeto da classe Endereço")
    void deveInstanciarClasseEnderecoCorretamente() {
        Endereco endereco = new Endereco("Rua das Papoulas", "58", "Bairro das Maravilhas", "José do Céu", "SP");

        assertEquals("Rua das Papoulas", endereco.getRua());
        assertEquals("58", endereco.getNumero());
        assertEquals("Bairro das Maravilhas", endereco.getBairro());
        assertEquals("José do Céu", endereco.getCidade());
        assertEquals("SP", endereco.getEstado());
        assertEquals("Brasil", endereco.getPais());
    }

}