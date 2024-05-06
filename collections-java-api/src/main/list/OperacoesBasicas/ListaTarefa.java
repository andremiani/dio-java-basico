package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listatarefa;

    public ListaTarefa() {
        this.listatarefa = new ArrayList<>();
    }

    public List<Tarefa> getListatarefa() {
        return this.listatarefa;
    }

    public void adicionarTarefa(String descricao) {
        listatarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listatarefa) {
            if (t.getDecricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listatarefa.removeAll(tarefasParaRemover);
    }

    public int obterTotalDeTarefas() {
        return listatarefa.size();
    }

    public void obterTarefas() {
        System.out.println(listatarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalDeTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalDeTarefas());
        listaTarefa.obterTarefas();

    }

}
