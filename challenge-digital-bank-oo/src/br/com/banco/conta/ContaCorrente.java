package br.com.banco.conta;


import br.com.banco.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        for (String transacao : getHistoricoTransacoes()) {
            System.out.println(transacao);
        }
    }

}
