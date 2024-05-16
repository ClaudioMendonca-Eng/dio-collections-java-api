# dio-collections-java-api
Este repositório é referente ao curso "Collection Framework API Java" e é uma valiosa contribuição para a comunidade de desenvolvedores Java, fornecendo exemplos práticos e recursos educacionais relacionados à poderosa API de coleções da linguagem Java.


# Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes elementos precisão ser Objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.
- O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a coleção independente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: `List` (lista), `Set` (conjunto), `Queue` (fila) e `Map` (mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

[![](https://mermaid.ink/img/pako:eNqllU1z2jAQQP-KRrnajHGAgDscAJPEKbQB3Exa0YNir4MGY7myaEIy_PcKYT7iQnuwT0J6-7SrWaF3HPAQsIOjmL8EMyok8t1pgtTne-SWgaAimK0Qj1CPxzEEkvEEXQu6gBcu5ogl6I7-pj8dx4k4ryLTNJHn98ed7qC_1WTLp2dB01lhOmQil_nd7UyHeFJt9xRDbkPtNvIWaQwLSGSmfrVRlxyy2FHq2wq6JwJ6ZMAymaPnMZeMlrCE_3J9MoGPth4yK6j_KiEJMzU00TXpCEFXetszyI1KKplDeMTcFJnbrcaFXzqxMyaPPKjD4CJf906kfEcmkgbznHB12GdyLxgXTK7Q6EjvnggfkI8p9E8wQzLhQkK4OZsdVUj0C7ml2ewfwNf8TD5iwyJ2T3wBkO0BtZCXnneX7sBh577QfPuZERnS9HyDjfNSDtA2bHyCnehciuSomLKvS_d1Y59Bvh2K1zufwR606QDsi9-XOYDn_eQj8RJ1oSIa7Pb9TlQLxTTLECoa1PnokzsW5G65igF1UMTi2LmI4CkIG0YmBZ-Dc2FZVj42X1goZ46dvhoBj7nQa8eGbmlDr7TBLW3olzYMShuGpQ2j0oZxacNjCUOwaWIXIrS5xBFPpJmxN3BsK5Wf_iaqR8hlXSHYwAsQC8pC9fC9bwKmWM7UzZ5iRw1DKuZTPE3WiqNLySerJMCOFEsw8DINqQSXUXXfFrvJlCbYecev2Kk27Uqj2ai37NZVw7Ia1aaBV9ixKy01V6vZV3atVm_atfrawG-cK4NVaeVfs3Z52bDtKwNDyNR_-nD7MOv3We_xQwdstlz_AYKBZxc?type=png)](https://mermaid.live/edit#pako:eNqllU1z2jAQQP-KRrnajHGAgDscAJPEKbQB3Exa0YNir4MGY7myaEIy_PcKYT7iQnuwT0J6-7SrWaF3HPAQsIOjmL8EMyok8t1pgtTne-SWgaAimK0Qj1CPxzEEkvEEXQu6gBcu5ogl6I7-pj8dx4k4ryLTNJHn98ed7qC_1WTLp2dB01lhOmQil_nd7UyHeFJt9xRDbkPtNvIWaQwLSGSmfrVRlxyy2FHq2wq6JwJ6ZMAymaPnMZeMlrCE_3J9MoGPth4yK6j_KiEJMzU00TXpCEFXetszyI1KKplDeMTcFJnbrcaFXzqxMyaPPKjD4CJf906kfEcmkgbznHB12GdyLxgXTK7Q6EjvnggfkI8p9E8wQzLhQkK4OZsdVUj0C7ml2ewfwNf8TD5iwyJ2T3wBkO0BtZCXnneX7sBh577QfPuZERnS9HyDjfNSDtA2bHyCnehciuSomLKvS_d1Y59Bvh2K1zufwR606QDsi9-XOYDn_eQj8RJ1oSIa7Pb9TlQLxTTLECoa1PnokzsW5G65igF1UMTi2LmI4CkIG0YmBZ-Dc2FZVj42X1goZ46dvhoBj7nQa8eGbmlDr7TBLW3olzYMShuGpQ2j0oZxacNjCUOwaWIXIrS5xBFPpJmxN3BsK5Wf_iaqR8hlXSHYwAsQC8pC9fC9bwKmWM7UzZ5iRw1DKuZTPE3WiqNLySerJMCOFEsw8DINqQSXUXXfFrvJlCbYecev2Kk27Uqj2ai37NZVw7Ia1aaBV9ixKy01V6vZV3atVm_atfrawG-cK4NVaeVfs3Z52bDtKwNDyNR_-nD7MOv3We_xQwdstlz_AYKBZxc)

<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>


- Todas as interfaces e classes são encontradas dentro do pacote (package) `java.util`.
- Embora a interface `Map` não ser filha direta da interface `Collection` ela também é considerada uma coleção devido a sua função.

<p align="center">
<img src="./assets/image/collection-framework-methods.png" alt="List interface hierarchy Java"><br>
<a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html">Method Sumary Collection Interface</a>
</p>


---

### Referências:

[1] "Java Collections - Universidade Java." Universidade Java. Disponível em: http://www.universidadejava.com.br/java/java-collection/.

[2] "Java™ Platform, Standard Edition 17 API Specification - Interface Collection." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html.

[3] "Java Comparator and Comparable - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-comparator-comparable.

[4] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.

---
