package main.list.OperacoesBasicas;

public class Tarefa {
    private String decricao;

    public Tarefa(String decricao) {
        this.decricao = decricao;
    }

    public String getDecricao() {
        return this.decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    @Override
    public String toString() {
        return getDecricao();
    }

}
