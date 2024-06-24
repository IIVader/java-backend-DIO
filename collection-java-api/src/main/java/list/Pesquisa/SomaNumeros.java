package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeroList=" + numeroList +
                '}';
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeroList.isEmpty()) {
            for (Integer n : numeroList) {
                soma += n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer n : numeroList) {
                if (n > maiorNumero) {
                    maiorNumero = n;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer n : numeroList) {
                if (n < menorNumero) {
                    menorNumero = n;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}


