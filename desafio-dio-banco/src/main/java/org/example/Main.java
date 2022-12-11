package org.example;

public class Main {
    public static void main(String[] args) {
        // sugestoes de evolucao: extnder o dominio, incluindo novas classes, atributos e/ou mmetodos;
        // incluir lombok no projeto


        Cliente cleber = new Cliente();
        cleber.dadosCadastrais("cleber","323.444.222-01");
        Conta contaCorrente = new ContaCorrente(cleber);
        Conta contaPoupanca = new ContaPoupanca(cleber);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100,contaPoupanca);

        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();

    }
}
