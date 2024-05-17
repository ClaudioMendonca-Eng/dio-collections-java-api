package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Método toString
    @Override 
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
    }

    // Método compareTo
    @Override
    public int compareTo(Pessoa pessoa) {
        if (this.idade < pessoa.getIdade()) {
            return -1;
        } else if (this.idade > pessoa.getIdade()) {
            return 1;
        } else {
            return 0;
        }
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}
