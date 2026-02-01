
# ⚓ Batalha Naval em Java

Este projeto implementa o clássico jogo de **Batalha Naval** via console. Ele foi desenvolvido como um exercício prático para o curso de **Análise e Desenvolvimento de Sistemas (IFSC)**, focando em lógica de programação e manipulação de estruturas de dados.

## 🚀 Sobre o Projeto

O jogo desafia o jogador a encontrar 3 navios inimigos escondidos em um oceano (matriz 5x5). O sistema utiliza uma lógica de **dois tabuleiros**:

1. **Tabuleiro Lógico:** Onde os navios são posicionados aleatoriamente e a lógica de acerto é processada.
2. **Tabuleiro Gráfico:** O que é exibido para o jogador (comandante), ocultando a posição dos navios até que sejam atingidos.

### 🧠 Principais Aprendizados e Desafios

* **Matrizes (Arrays Bidimensionais):** Manipulação de grades para representar o campo de batalha.
* **Algoritmo de Posicionamento:** Implementação de um loop de validação para garantir que os navios nunca sejam sorteados na mesma coordenada.
* **Controle de Fluxo Avançado:** Uso de **Labeled Breaks** (`break jogo;`) para encerrar loops aninhados no momento exato da vitória.
* **Modularização:** Criação de métodos universais (como o `exibirTabuleiro`) que aceitam diferentes matrizes como parâmetros.

## 🛠️ Tecnologias Utilizadas

* **Java 17** (ou superior)
* **Git & GitHub**

## 🎮 Como Executar

1. **Abra o terminal (PowerShell ou CMD) e vá para a raiz do disco:**

    ```powershell
    cd \
    ```

1. **Clone o repositório diretamente no C::**

    ```bash
    git clone [https://github.com/AlineAntuarte/batalhaNaval.git](https://github.com/AlineAntuarte/batalhaNaval.git)
    ```

1. **Navegue até a pasta onde o código-fonte reside:**

    ```powershell
    cd batalhaNaval/batalhaNaval/src
    ```

1. **Compile o código:**

    ```powershell
    javac oceano.java
    ```

1. **Execute o jogo:**

    ```powershell
    java oceano
    ```

## 📋 Funcionalidades (Roadmap)

* [x] Criação de tabuleiro dinâmico.
* [x] Sistema de tiros por coordenadas via `Scanner`.
* [x] Posicionamento aleatório de navios com validação de sobreposição.
* [x] Lógica de vitória com contador de abates.
* [ ] Implementação de interface colorida (ANSI colors).
* [ ] Opção para diferentes níveis de dificuldade (tamanhos de mapa).

## 📝 Licença

Este projeto está sob a licença **MIT** - consulte o arquivo [LICENSE](https://www.google.com/search?q=LICENSE) para detalhes.

---

Desenvolvido por **Aline Barbosa Antuarte** 👋

[LinkedIn](https://www.google.com/search?q=https://www.linkedin.com/in/aline-barbosa-antuarte-3078b2245) | [aline.ba@aluno.ifsc.edu.br](mailto:aline.ba@aluno.ifsc.edu.br)

---
