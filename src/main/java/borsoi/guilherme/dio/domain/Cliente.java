package borsoi.guilherme.dio.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cliente {

    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private int idade;

    public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = definirIdade(dataNascimento);
    }

    private int definirIdade(LocalDate dataNascimento) {
        return LocalDate.now().compareTo(dataNascimento);
    }
}
