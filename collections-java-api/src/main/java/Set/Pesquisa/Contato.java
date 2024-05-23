package main.java.Set.Pesquisa;

public class Contato {
    // atributos
    private String nome;
    private int telefone;

    // construtor
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    // setters telefone
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }



    // equals somente para o nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return getNome().equals(contato.getNome());
    }

    // toString
    @Override
    public String toString() {
        return "{" + nome + "," + telefone + "}";
      
    }


}
