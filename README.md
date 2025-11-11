# TDE 04: Comparação de Algoritmos de Ordenação

Projeto acadêmico para a disciplina de **Resolução de Problemas Estruturados em Computação** do curso de **Bacharelado em Sistemas de Informação** da **Pontifícia Universidade Católica do Paraná (PUCPR)**.

O projeto consiste na implementação e análise de performance de três algoritmos de ordenação clássicos.

---

## 🎯 Objetivo

O objetivo deste trabalho é implementar, analisar e comparar a eficiência dos algoritmos de ordenação **Bubble Sort**, **Insertion Sort** e **Quick Sort**. A análise é realizada medindo o tempo de execução de cada algoritmo ao processar diferentes conjuntos de dados, que variam em tamanho e ordem inicial. A medição de tempo é feita usando `System.nanoTime()` para precisão.

---

## 🛠️ Algoritmos Implementados

Os três algoritmos solicitados foram implementados:
1.  **Bubble Sort**: Implementação otimizada que para a execução se o array já estiver ordenado.
2.  **Insertion Sort**: Implementação padrão.
3.  **Quick Sort**: Implementação recursiva utilizando a partição de Lomuto (pivô no final).

---

## 📊 Conjuntos de Dados

Os algoritmos são aplicados a 9 conjuntos de dados diferentes, fornecidos em arquivos `.csv`. Eles estão divididos em três cenários:

* **Aleatório**: Dados em ordem aleatória (tamanhos 100, 1.000 e 10.000).
* **Crescente**: Dados já em ordem crescente (tamanhos 100, 1.000 e 10.000).
* **Decrescente**: Dados em ordem decrescente (tamanhos 100, 1.000 e 10.000).

---

## 🚀 Como Executar

### 1. Pré-requisitos

* Ter o **Java Development Kit (JDK)** (versão 8 ou superior) instalado e configurado.

### 2. Preparação

1.  Clone ou baixe este repositório.
2.  Baixe os 9 arquivos `.csv` fornecidos no enunciado do trabalho.
3.  Crie uma pasta chamada `dados` na raiz do projeto.
4.  Coloque os 9 arquivos `.csv` dentro da pasta `dados/`.

### 3. Compilação

Abra um terminal na pasta raiz do projeto e execute o seguinte comando para compilar os arquivos Java:

```bash
javac Main.java SortingAlgorithms.java FileLoader.java
```

### 4. Execução
Após a compilação, execute a classe principal para iniciar os testes e medições:

```Bash
java Main
```
