# 1. O que muda de Vetor para Matriz?

No **vetor**, você acessa um valor com apenas um índice: `vetor[3]`.
Na **matriz**, você precisa de dois: um para a **linha** e outro para a **coluna**: `matriz[linha][coluna]`.

**Como declarar no Java:**

```java
// Um vetor de 10 posições
char[] vetor = new char[10];

// Uma matriz (tabuleiro) de 10 linhas e 10 colunas
char[][] tabuleiro = new char[10][10];

```

---

## 2. Passando Arrays para Métodos

O guia que você achou mencionou isso porque, no Batalha Naval, você vai querer criar métodos para não poluir o `main`. Por exemplo, um método só para desenhar o tabuleiro e outro só para verificar o tiro.

**Como passar um vetor:**

```java
public static void imprimirVetor(int[] meuVetor) { ... }

```

**Como passar uma matriz (o tabuleiro):**

```java
public static void imprimirTabuleiro(char[][] grade) {
    for (int i = 0; i < grade.length; i++) { // Percorre as linhas
        for (int j = 0; j < grade[i].length; j++) { // Percorre as colunas
            System.out.print(grade[i][j] + " ");
        }
        System.out.println(); // Pula linha ao final de cada fileira
    }
}

```

---

### 3. Aplicando ao seu Batalha Naval

Para o seu jogo, a matriz será o mapa. Imagine que:

* `~` é água.
* `N` é um navio.
* `X` é onde o jogador atirou e acertou um navio.
* `O` é onde o jogador atirou e acertou a água.

**Exemplo de lógica de tiro:**
Se o jogador digitar que quer atirar na **Linha 2, Coluna 5**:

```java
int linha = 2;
int coluna = 5;

if (tabuleiro[linha][coluna] == 'N') {
    System.out.println("BUM! Acertou um navio!");
    tabuleiro[linha][coluna] = 'X';
} else {
    System.out.println(" splash... Água.");
    tabuleiro[linha][coluna] = 'O';
}

```

---

### 4. O uso do `Random`

Como o guia citou "números aleatórios", você vai usar a classe `Random` para o computador escolher onde esconder os navios dele sem que você saiba.

```java
import java.util.Random;

Random gerador = new Random();
int linhaAleatoria = gerador.nextInt(10); // Gera de 0 a 9
int colunaAleatoria = gerador.nextInt(10); // Gera de 0 a 9

tabuleiro[linhaAleatoria][colunaAleatoria] = 'N'; // Esconde o navio

```
