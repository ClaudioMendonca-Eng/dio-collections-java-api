package main.java.Set.Ordenacao;



import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    // Atributos
    private long codigo;
    private String nome;
    private Double preco;
    private int quantidade;

    // Construtor
    public Produto(long codigo, String nome, Double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // equals somente codigo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        return codigo == produto.codigo;
    }
    

    // toString
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // compareTo
    @Override
    public int compareTo(Produto outroProduto) {
        return nome.compareToIgnoreCase(outroProduto.getNome());
    }

    class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
          return Double.compare(p1.getPreco(), p2.getPreco());
        }
      }


}

