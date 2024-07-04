package br.com.banco.conta;


import br.com.banco.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
        for (String transacao : getHistoricoTransacoes()) {
            System.out.println(transacao);
        }
    }
}