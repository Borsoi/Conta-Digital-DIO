package borsoi.guilherme.dio.domain;

import lombok.Getter;

@Getter
public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = "Brasil";
    }
}
