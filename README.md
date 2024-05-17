# dio-collections-java-api
Este repositório é referente ao curso "Collection Framework API Java" e é uma valiosa contribuição para a comunidade de desenvolvedores Java, fornecendo exemplos práticos e recursos educacionais relacionados à poderosa API de coleções da linguagem Java.


# Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes elementos precisão ser Objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.
- O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a coleção independente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: `List` (lista), `Set` (conjunto), `Queue` (fila) e `Map` (mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

| [![](https://mermaid.ink/img/pako:eNqllEGTmjAUgP9KJnsFB7CuazoeVNiVrba71emhsYcIj5oRCQ1hlXX8743IbtVqeyDDMCH53vfeZMLb4kCEgAmOYrEOFkwqNHVnCdJj6tMhB8lksCiQiNBAxDEEiosE3Uu2grWQS8QT9Mhe2A9CSCSEjUzTRP7U-9rrj7yDJsvnPyVLF2fLIZeVbNo_rPSor3S6eQyVDXW7yF-lMawgUZn-6qI-_VPFG6XHQdC_EDCgI56pCr2OufQ5hxz-y3l0Aqe2ATIbyNsoSMJMT010T3tSsqJMewV50EUlSwiPmIdzZnjQuPCrLOyKyaff9GEIWe37F0p-pBPFgmVFuOeGT_RJciG5KtDzUSb3gmlET6vxLjBjOhFSQbg_pjfqLONnOmTZ4h_Al-p4TrHxOfZEpxIgewf0RnXjVBED6qGIxzG5iWAehLdGpqRYArmxLKuam2seqgVx0o0RiFjIcu_Y0K9tGNQ2uLUNXm3DqLZhXMNweAcxyzIXIrT_4yORKDPjr0AcK1Uf_ybsI6TZ0gg28ArkivFQt7rtPmCG1ULf2xkmehoyuZzhWbLTHMuVmBRJgImSORg4T0OmwOVMd7EVJhGLM72asgSTLd5g4rTuGpZtt2-tTrvTdjrtpoELTO4arZbdfH8-NHcGfhVCG-yGVY1m27lzrH0AhFz_xeNDKy47cpniexmwr2P3G8y8xCA?type=png)](https://mermaid.live/edit#pako:eNqllEGTmjAUgP9KJnsFB7CuazoeVNiVrba71emhsYcIj5oRCQ1hlXX8743IbtVqeyDDMCH53vfeZMLb4kCEgAmOYrEOFkwqNHVnCdJj6tMhB8lksCiQiNBAxDEEiosE3Uu2grWQS8QT9Mhe2A9CSCSEjUzTRP7U-9rrj7yDJsvnPyVLF2fLIZeVbNo_rPSor3S6eQyVDXW7yF-lMawgUZn-6qI-_VPFG6XHQdC_EDCgI56pCr2OufQ5hxz-y3l0Aqe2ATIbyNsoSMJMT010T3tSsqJMewV50EUlSwiPmIdzZnjQuPCrLOyKyaff9GEIWe37F0p-pBPFgmVFuOeGT_RJciG5KtDzUSb3gmlET6vxLjBjOhFSQbg_pjfqLONnOmTZ4h_Al-p4TrHxOfZEpxIgewf0RnXjVBED6qGIxzG5iWAehLdGpqRYArmxLKuam2seqgVx0o0RiFjIcu_Y0K9tGNQ2uLUNXm3DqLZhXMNweAcxyzIXIrT_4yORKDPjr0AcK1Uf_ybsI6TZ0gg28ArkivFQt7rtPmCG1ULf2xkmehoyuZzhWbLTHMuVmBRJgImSORg4T0OmwOVMd7EVJhGLM72asgSTLd5g4rTuGpZtt2-tTrvTdjrtpoELTO4arZbdfH8-NHcGfhVCG-yGVY1m27lzrH0AhFz_xeNDKy47cpniexmwr2P3G8y8xCA) |
|:---:|
| [![](https://mermaid.ink/img/pako:eNqdkstuwjAQRX_FGrYBJYRAcMWiEpVaqUjl0S6asDDxpIlw4sg24iX-vSZBArVlUy-sa8-ZO7bHR0gkR6CQCrlNMqYMWYzjktjRzHqz-lKsysjk8a3ZmUYTVi0ppamUZDQiL0UlsMDSaLsakVk0l8ogv0JN2uwPdh4tFOJPckraHfK0M1hybWWbLKJnprMFWwlc3kHeo9e8XCO3YF35DvZRO10BG6jFzY0v1zZ7gTY_zYWgrRRXCe872ii5RtpyXfei29ucm4x2q52TSCFVHbt1mP3fobFJBNN6jCk5v3YqS9PW-QFp163Mw2_Cu0H8wCLgQIGqYDm3PT6eE2IwmW1BDNRKztQ6hrg8WY5tjJzvywSoURt0YFNxZnCcM9v_AmjKhLa7FSuBHmEHNOwE4TDoem7Y6w3Cvu87sAfqex0rbWQQBH1v4PrhyYGDlNbB67jN8MPQHfb8YdcB5LmRatL8wfor1iU-64TzOU7f8SHOzA?type=png)](https://mermaid.live/edit#pako:eNqdkstuwjAQRX_FGrYBJYRAcMWiEpVaqUjl0S6asDDxpIlw4sg24iX-vSZBArVlUy-sa8-ZO7bHR0gkR6CQCrlNMqYMWYzjktjRzHqz-lKsysjk8a3ZmUYTVi0ppamUZDQiL0UlsMDSaLsakVk0l8ogv0JN2uwPdh4tFOJPckraHfK0M1hybWWbLKJnprMFWwlc3kHeo9e8XCO3YF35DvZRO10BG6jFzY0v1zZ7gTY_zYWgrRRXCe872ii5RtpyXfei29ucm4x2q52TSCFVHbt1mP3fobFJBNN6jCk5v3YqS9PW-QFp163Mw2_Cu0H8wCLgQIGqYDm3PT6eE2IwmW1BDNRKztQ6hrg8WY5tjJzvywSoURt0YFNxZnCcM9v_AmjKhLa7FSuBHmEHNOwE4TDoem7Y6w3Cvu87sAfqex0rbWQQBH1v4PrhyYGDlNbB67jN8MPQHfb8YdcB5LmRatL8wfor1iU-64TzOU7f8SHOzA) |
| [![](https://mermaid.ink/img/pako:eNplkU1PwzAMhv9KZK7dlH6mDUd2QYITHAYrhyxx12ppU6Wp9qX9d7J2ICQixbLePH4txxeQRiFwqLQ5yFpYR95XZUf8meMwbndW9DV5wR12ahbXm-fOoa2ExK9Z-dgQ8qTFMBByV37hKd7N3EkjWZOq0Zo_VLiVKgsGZ80e-QOl9J4vDo1yNY_6YyCNNnZ6mx3krccKK1IZ42_nFkNzRh7R3j3-J8I_SJx6BAJo0baiUX7ky62gBFdjiyVwnyph9yWU3dVzYnTm7dRJ4M6OGMDYK-Fw1Qj_He2P2IsO-AWOwNMljVMaFzTOk4yypAjgBDyMlknEsrQIC8aKnIb5NYCzMd4gXFKWRyxJ8jxJClpkLABUjTP2dd7ItJipxedUUAk94PUbaKqEuw?type=png)](https://mermaid.live/edit#pako:eNplkU1PwzAMhv9KZK7dlH6mDUd2QYITHAYrhyxx12ppU6Wp9qX9d7J2ICQixbLePH4txxeQRiFwqLQ5yFpYR95XZUf8meMwbndW9DV5wR12ahbXm-fOoa2ExK9Z-dgQ8qTFMBByV37hKd7N3EkjWZOq0Zo_VLiVKgsGZ80e-QOl9J4vDo1yNY_6YyCNNnZ6mx3krccKK1IZ42_nFkNzRh7R3j3-J8I_SJx6BAJo0baiUX7ky62gBFdjiyVwnyph9yWU3dVzYnTm7dRJ4M6OGMDYK-Fw1Qj_He2P2IsO-AWOwNMljVMaFzTOk4yypAjgBDyMlknEsrQIC8aKnIb5NYCzMd4gXFKWRyxJ8jxJClpkLABUjTP2dd7ItJipxedUUAk94PUbaKqEuw) |


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
