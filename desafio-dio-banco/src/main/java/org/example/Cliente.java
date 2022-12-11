package org.example;

public class Cliente {
    private String nome;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dadosCadastrais(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }
}
