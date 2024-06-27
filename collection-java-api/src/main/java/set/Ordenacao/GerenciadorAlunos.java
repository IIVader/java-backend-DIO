package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(int matricula) {
        if (alunosSet.isEmpty()) {
            throw new RuntimeException("O conjunto está vazio!");
        }

        boolean removed = alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
        if (!removed) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public Set<Alunos> exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);

        if (!alunosSet.isEmpty()) {
            return alunosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Alunos> exibirAlunosPorNota() {
        Set<Alunos> alunosPorNome = new TreeSet<>(new ComparatorPorNota());

        if (!alunosSet.isEmpty()) {
            alunosPorNome.addAll(alunosSet);
            return alunosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459, 8.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000);
        gerenciadorAlunos.removerAluno(123457);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
