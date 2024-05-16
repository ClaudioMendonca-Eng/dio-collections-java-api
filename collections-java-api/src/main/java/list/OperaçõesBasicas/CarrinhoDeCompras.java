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
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.obterValorTotal());

        carrinhoDeCompras.adicionarItem("Camiseta", 50.0, 2);
        carrinhoDeCompras.adicionarItem("Calça", 100.0, 1);
        carrinhoDeCompras.adicionarItem("Tênis", 200.0, 1);
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.obterValorTotal());

        carrinhoDeCompras.removerItem("Calça");
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.obterValorTotal());

        carrinhoDeCompras.obterItens();
    }

}
