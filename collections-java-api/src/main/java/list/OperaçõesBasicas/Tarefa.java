package main.java.list.OperaçõesBasicas;

public class Tarefa {
    // Atributos
    private String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Getters 
    public String getDescricao() {
        return descricao;
    }

    // toString
    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }


}
