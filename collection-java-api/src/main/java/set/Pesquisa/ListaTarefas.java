package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Lista de Tarefas vazia!");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else {
            System.out.println("Lista de Tarefas vazia!");
        }
    }

    public int contarTarefas() {
        if(!tarefaSet.isEmpty()){
            return tarefaSet.size();
        } else {
            System.out.println("Lista de Tarefas vazia!");
            return -1;
        }

    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getStatus()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Lista de Tarefas vazia!");
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.getStatus()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("Lista de Tarefas vazia!");
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(true);
                    break;
                }
            }
        } else {
            System.out.println("Lista de Tarefas vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(false);
                    break;
                }
            }
        } else {
            System.out.println("Lista de Tarefas vazia!");
        }
    }

    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas já está vazia");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
