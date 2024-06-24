package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
            if(!itensList.isEmpty()){
                for(Item i: itensList){
                    if(i.getNome().equalsIgnoreCase(nome)){
                        itensParaRemover.add(i);
                    }
                }
                itensList.removeAll(itensParaRemover);
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!itensList.isEmpty()){
            for(Item i: itensList) {
                valorTotal += (i.getPreco() * i.getQuantidade());
            }
        } else {
            return valorTotal;
        }
        return valorTotal;
    }

    public void exibirItens(){
        if(!itensList.isEmpty()){
            for(Item i: itensList){
                System.out.println(i);
            }
        } else {
            System.out.println("Lista vazia");
        }

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Bolo", 12.90, 2);
        carrinhoDeCompras.adicionarItem("Mascara", 11, 1);
        carrinhoDeCompras.adicionarItem("Garrafa", 15, 3);

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Garrafa");

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }

}
