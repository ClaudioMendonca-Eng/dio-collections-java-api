package main.java.list.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributos
    private List<Item> itens;

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensRemover.add(item);
            }
        }
        itens.removeAll(itensRemover);
    }
    
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public double obterValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void obterItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.obterItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.obterItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}
