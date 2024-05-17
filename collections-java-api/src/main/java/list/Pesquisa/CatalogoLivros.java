package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributos
    private List<Livro> livrosList;

    // Construtor   
    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livrosList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        for (Livro livro : livrosList) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosAutor.add(livro);
            }
        }
        return livrosAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        for (Livro livro : livrosList) {
            if (livro.getAno() >= anoInicio && livro.getAno() <= anoFim) {
                livrosPorIntervaloAno.add(livro);
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        for (Livro livro : livrosList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = livro;
                break;
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {

        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();
    
        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        // Exibindo livros pelo mesmo autor
        System.err.println("------------------------------------");
        System.err.println("Livros do autor Robert C. Martin:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.err.println("------------------------------------");
        System.err.println("Livros do autor Autor Inexistente:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
    
        // Exibindo livros dentro de um intervalo de anos
        System.err.println("------------------------------------");
        System.err.println("Livros entre 2010 e 2022:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
    
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.err.println("------------------------------------");
        System.err.println("Livros entre 2025 e 2030:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));
    
        // Exibindo livros por título
        System.err.println("------------------------------------");
        System.err.println("Livro com título Java Guia do Programador:");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
    
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.err.println("------------------------------------");
        System.err.println("Livro com título Título Inexistente:");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
      }
}
