package main.java.Map.OperacoesBasicas;

import java.util.Map;

public class AgendaContatos {
    // Atributos
    private static Map<String, Integer> agendaContatoMap;

    // Construtor
    public AgendaContatos(Map<String, Integer> agendaContatoMap) {
        AgendaContatos.agendaContatoMap = agendaContatoMap;
    }

    // Métodos
    public void adicionarContato(String nome, Integer numero) {
        agendaContatoMap.put(nome, numero);
    
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : agendaContatoMap.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + " - Número: " + entry.getValue());
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome != null) {
                System.out.println("Número do contato " + nome + ": " + numeroPorNome);
            } else {
                System.out.println("Contato não encontrado!");
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(agendaContatoMap);
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
    
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
      }

}
