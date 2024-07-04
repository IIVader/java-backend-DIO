package br.com.banco.main;

import java.util.List;
import br.com.banco.conta.Conta;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> conta) {
        this.contas = conta;
    }

}
