# SET

<p align="right">
  <a href="https://github.com/ClaudioMendonca-Eng/dio-collections-java-api" style="text-decoration: none; background-color: #007bff; color: white; padding: 10px 20px; border-radius: 5px;">Voltar para o início</a>
</p>

<p align="center">
<a>

| [![](https://mermaid.ink/img/pako:eNqlk01vozAQQP-K5V4hgtCkXVc5hA2rZtW0q4ZTYQ8OHhYrxka2s0ka5b_XCfS76iXIQsPMm2cE4x0uFANMcCnUuqiotiid5BK5K51m1xw01UW1RapEP5UQUFiuJPqlaQ1rpZeIS_Sb_qd_CSGlUiHyfR9N0-R-HN8krcasFv80baoPacZ1J0vjNjPOptZttxDQ2dBohKZ1I6AGaY17GqE4e32Ljmqb4y_gJJuDfUclX1CzbK60BXZgnym_h5KNBcmMC310m11TU30D3GU3XC6BvcdmH7E_WaoBzAvgCt03slsBaIxKLgQ5K2FRsKFnrFZLIGdBEHSxv-bMVqTfbLxCCaWPtbeG-GRDcrJhdoKhvReCGjOBEh1moFTS-oY_AukHjb36TIRvkGjgEOzhGnRNOXNjvTs05NhW7o_nmLiQUb3McS73jqMrq-ZbWWBi9Qo8vGoYtTDh1E1s_ZxsqMRkhzeYXES9Yf_HeRgFwfBi4JaHt5hc9gaDMHpZ59Hew49Kuf7Qw8C4VXrWnrHjUTsKH471g3__BBvtG0Y?type=png)](https://mermaid.live/edit#pako:eNqlk01vozAQQP-K5V4hgtCkXVc5hA2rZtW0q4ZTYQ8OHhYrxka2s0ka5b_XCfS76iXIQsPMm2cE4x0uFANMcCnUuqiotiid5BK5K51m1xw01UW1RapEP5UQUFiuJPqlaQ1rpZeIS_Sb_qd_CSGlUiHyfR9N0-R-HN8krcasFv80baoPacZ1J0vjNjPOptZttxDQ2dBohKZ1I6AGaY17GqE4e32Ljmqb4y_gJJuDfUclX1CzbK60BXZgnym_h5KNBcmMC310m11TU30D3GU3XC6BvcdmH7E_WaoBzAvgCt03slsBaIxKLgQ5K2FRsKFnrFZLIGdBEHSxv-bMVqTfbLxCCaWPtbeG-GRDcrJhdoKhvReCGjOBEh1moFTS-oY_AukHjb36TIRvkGjgEOzhGnRNOXNjvTs05NhW7o_nmLiQUb3McS73jqMrq-ZbWWBi9Qo8vGoYtTDh1E1s_ZxsqMRkhzeYXES9Yf_HeRgFwfBi4JaHt5hc9gaDMHpZ59Hew49Kuf7Qw8C4VXrWnrHjUTsKH471g3__BBvtG0Y) |
|:---:|
| [![](https://mermaid.ink/img/pako:eNplkU1PwzAMhv9KZK7dlH6mDUd2QYITHAYrhyxx12ppU6Wp9qX9d7J2ICQixbLePH4txxeQRiFwqLQ5yFpYR95XZUf8meMwbndW9DV5wR12ahbXm-fOoa2ExK9Z-dgQ8qTFMBByV37hKd7N3EkjWZOq0Zo_VLiVKgsGZ80e-QOl9J4vDo1yNY_6YyCNNnZ6mx3krccKK1IZ42_nFkNzRh7R3j3-J8I_SJx6BAJo0baiUX7ky62gBFdjiyVwnyph9yWU3dVzYnTm7dRJ4M6OGMDYK-Fw1Qj_He2P2IsO-AWOwNMljVMaFzTOk4yypAjgBDyMlknEsrQIC8aKnIb5NYCzMd4gXFKWRyxJ8jxJClpkLABUjTP2dd7ItJipxedUUAk94PUbaKqEuw?type=png)](https://mermaid.live/edit#pako:eNplkU1PwzAMhv9KZK7dlH6mDUd2QYITHAYrhyxx12ppU6Wp9qX9d7J2ICQixbLePH4txxeQRiFwqLQ5yFpYR95XZUf8meMwbndW9DV5wR12ahbXm-fOoa2ExK9Z-dgQ8qTFMBByV37hKd7N3EkjWZOq0Zo_VLiVKgsGZ80e-QOl9J4vDo1yNY_6YyCNNnZ6mx3krccKK1IZ42_nFkNzRh7R3j3-J8I_SJx6BAJo0baiUX7ky62gBFdjiyVwnyph9yWU3dVzYnTm7dRJ4M6OGMDYK-Fw1Qj_He2P2IsO-AWOwNMljVMaFzTOk4yypAjgBDyMlknEsrQIC8aKnIb5NYCzMd4gXFKWRyxJ8jxJClpkLABUjTP2dd7ItJipxedUUAk94PUbaKqEuw) |

</a>
</p>

- A interface `Set` é uma coleção que não pode conter elementos duplicados.
- Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas.
- A plataforma Java possui três implementações de `Set` de uso geral: `HashSet`, `TreeSet` e `LinkedHashSet`.
- A interface `Set` não permite acesso aleatório a um elemento na coleção.
- Para percorrer os elementos de um `Set`, você pode usar um iterador ou um loop foreach.

> ##### *HashSet*: O HashSet é uma implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto.

> ##### *TreeSet*: O TreeSet é uma implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet.

> ##### *LinkedHashSet*: O LinkedHashSet é uma implementação da interface Set que mantém a ordem de inserção dos elementos, além de usar uma tabela hash para obter um bom desempenho de busca. Ele é semelhante ao HashSet, mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O LinkedHashSet é útil quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca.

### Referências:

[1] "Collections in Java Tutorial." DigitalOcean Community. Disponível em: https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial.

[2] "Java™ Platform, Standard Edition 17 API Specification - Class Set." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html.

## Fixando os Conhecimentos

Exercícios:

1. Operações Básicas com Set
2. Pesquisa em Set
3. Ordenação nas Set

## Operações Básicas com Set

### 1. Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
</p>

### 2. Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

----

## Pesquisa em Set

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

### 2. Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>

---

## Ordenação em Set

### 1. Cadastro de Produtos

<p>
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.
</p>

### 2. Lista de Alunos

<p>
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
</p>

