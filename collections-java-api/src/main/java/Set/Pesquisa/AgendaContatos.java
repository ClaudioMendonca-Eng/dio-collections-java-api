package main.java.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // atributos
    private Set<Contato> contatosSet;

    // construtor
    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    // métodos
    public void adicionarContato(String nome, int telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoParaAtualizar = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoParaAtualizar = c;
                break;
            }
        }
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();
    
        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
    
        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    
        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
      }








    

}
