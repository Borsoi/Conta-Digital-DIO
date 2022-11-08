package borsoi.guilherme.dio.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Cliente {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private int idade;

    public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = definirIdade(dataNascimento);
    }

    public Cliente(String nome, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.idade = definirIdade(dataNascimento);
    }

    private int definirIdade(LocalDate dataNascimento) {
        return LocalDate.now().compareTo(dataNascimento);
    }
}
