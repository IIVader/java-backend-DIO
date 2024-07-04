package br.com.banco.conta;


import br.com.banco.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private List<String> historicoDeTransacoes = new ArrayList<>();

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public boolean validacaoDeTransacao(double valor) {
        return this.saldo > valor;
    }

    @Override
    public void sacar(double valor) {
        if (validacaoDeTransacao(valor)){
            saldo -= valor;
            historicoDeTransacoes.add("Saque: " + valor);
        } else {
            System.out.println("Transação incompleta! Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        historicoDeTransacoes.add("Deposito: " + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (validacaoDeTransacao(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            historicoDeTransacoes.add("Transferência: " + valor + " para " + contaDestino.getCliente().getNome());
        } else {
            System.out.println("Transação incompleta! Saldo insuficiente");
        }

    }

    public List<String> getHistoricoTransacoes() {
        return historicoDeTransacoes;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
