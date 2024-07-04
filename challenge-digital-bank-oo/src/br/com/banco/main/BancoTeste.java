package br.com.banco.main;

import br.com.banco.cliente.Cliente;
import br.com.banco.conta.Conta;
import br.com.banco.conta.ContaCorrente;
import br.com.banco.conta.ContaPoupanca;

public class BancoTeste {
    public static void main(String[] args) {

        Cliente jhordan = new Cliente("Jhordan", "007.007.007-07");

        Conta cc = new ContaCorrente(jhordan);
        Conta poupanca = new ContaPoupanca(jhordan);

        cc.depositar(100);
        cc.transferir(99, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
