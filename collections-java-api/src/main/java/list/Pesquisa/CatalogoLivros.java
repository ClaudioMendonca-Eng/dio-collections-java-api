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

    public List<Livro> pesquisaPorIntervaloAnos (int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        for (Livro livro : livrosList) {
            if (livro.getAno() >= anoInicio && livro.getAno() <= anoFim) {
                livrosPorIntervaloAno.add(livro);
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        for (Livro livro : livrosList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = livro;
                break;
            }
        }
        return livroPorTitulo;
    }
}
