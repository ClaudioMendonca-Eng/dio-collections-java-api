package main.java.Set.OperacoesBasicas;

public class Convidado {
    // atributos
    private String nome;
    private int codigoConvite;

    // construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // equals somente para o código do convite
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado)) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }


    // toString
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

}
