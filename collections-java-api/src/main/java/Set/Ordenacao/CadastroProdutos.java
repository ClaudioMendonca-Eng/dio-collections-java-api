package main.java.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import main.java.Set.Ordenacao.Produto.ComparatorPorPreco;

public class CadastroProdutos {

    // Atributos
    private Set<Produto> produtoSet;

    // Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // Métodos
    public void adicionarProduto(long codigo, String nome, Double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
          produtosPorPreco.addAll(produtoSet);
          return produtosPorPreco;
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
        
      }
  

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);
    
        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    
        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
      }
}
