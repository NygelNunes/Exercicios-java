# Lista de Exercícios 01 — Java

## Exercício 1: Estatísticas de Números Inteiros

Desenvolva um sistema que permita ao usuário digitar vários números inteiros (positivos ou negativos). O programa deve ser encerrado quando o usuário digitar o valor `-1`.

Ao final, o programa deve exibir:

* A **quantidade** de números digitados;
* O **maior** número digitado;
* O **menor** número digitado;
* A **média** aritmética dos números digitados.

> **Restrição:** Para este exercício, você **NÃO** deve utilizar vetores ou `ArrayList`.

---

## Exercício 2: Validador de Algoritmo de Luhn

O algoritmo de Luhn é uma fórmula de soma de verificação (checksum) utilizada para validar números de identificação, como cartões de crédito. O objetivo é determinar se uma `String` de números é válida.

### Regras de Validação

* **Comprimento:** Strings com comprimento 1 ou menor são inválidas.
* **Caracteres:** Espaços são permitidos, mas devem ser removidos antes da verificação. Caracteres não numéricos não são permitidos.
* **O Processo:**
1. Remova os espaços da string.
2. Começando pela direita, **dobre o valor de cada segundo dígito**.
3. Se o resultado da dobra for maior que `9`, subtraia `9` do produto.
4. Some todos os dígitos resultantes.
5. Se o total da soma for **divisível por 10**, o número é válido.



**Exemplo Prático:**

* **Entrada:** `4539 3195 0343 6467`
* **Dígitos dobrados:** `8` (de 4), `6` (de 3), `6` (de 3), `18-9=9` (de 9), `0`, `8` (de 4), `12-9=3` (de 6), `12-9=3` (de 6).
* **Soma final:** `80` (Divisível por 10 = Válido).

---

## Exercício 3: Distância de Hamming (DNA)

A Distância de Hamming é utilizada para medir a diferença entre duas cadeias de DNA, contando quantos erros (nucleotídeos diferentes) ocorreram durante a replicação celular.

As cadeias de DNA são representadas pelas letras **C, A, G e T**.

### Exemplo:

Dadas as duas fitas abaixo:

```text
G A G C C T A C T A A C G G G A T 
C A T C G T A A T G A C G G C C T 
^   ^   ^     ^   ^         ^ ^  
```

* Neste caso, existem **7 diferenças**, portanto, a distância de Hamming é **7**.

**Objetivo:** Crie um programa que receba duas Strings de mesmo comprimento e calcule o número de posições onde os caracteres são diferentes.

---
