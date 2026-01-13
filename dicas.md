
# Resumo: Vetores (Arrays) em Java ☕

## 1. Como criar (declarar) um Vetor?

Em Java, o vetor tem tamanho fixo. Você precisa dizer o **tipo** e o **tamanho** na hora de criar.

**Sintaxe:**
`Tipo[] nomeDoVetor = new Tipo[tamanho];`

**Exemplos:**
// Vetor para guardar 5 números inteiros

```java
int[] numeros = new int[5]; 
```

// Vetor para guardar 10 números reais (com vírgula)

```java
double[] notas = new double[10]; 
```

// Vetor para guardar 3 nomes

```java
String[] nomes = new String[3]; 
```

-----

## 2\. Como inserir valor em um Vetor?

Lembre-se: O índice (posição) sempre começa no **0**. Se o vetor tem tamanho 5, os índices vão de 0 a 4.

**Inserção manual (Fixa):**

```java
numeros[0] = 10; // Primeira posição
numeros[1] = 25; // Segunda posição
```

**Inserção pelo usuário (com Scanner):**

```java
// Supondo que você já tenha o 'Scanner leitor = ...'
System.out.print("Digite um número: ");
numeros[2] = leitor.nextInt(); 

System.out.print("Digite um nome: ");
nomes[0] = leitor.next(); // ou nextLine()
```

-----

## 3\. Como acessar (ler) um valor?

Basta chamar o nome do vetor seguido do índice entre colchetes `[]`.

```java
// Imprimir o valor
System.out.println(numeros[0]); 

// Usar em uma conta
int soma = numeros[0] + numeros[1];

// Guardar em outra variável
String primeiroNome = nomes[0];
```

-----

## 4\. Exemplo Prático Resolvido

**Problema:** Dado um vetor com 4 números reais, faça um algoritmo que percorra o vetor, preencha com dados do usuário e depois imprima o **maior** elemento.

```java
import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // 1. Criar o vetor (Tamanho 4)
        double[] valores = new double[4];
        
        // 2. Preencher o vetor (Usando laço FOR)
        // O .length pega o tamanho do vetor automaticamente
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            valores[i] = leitor.nextDouble();
        }

        // 3. Achar o maior elemento
        // Truque: Assumimos que o primeiro é o maior para começar a comparar
        double maior = valores[0]; 

        for (int i = 1; i < valores.length; i++) {
            // Se o valor atual for maior que o meu 'maior' provisório...
            if (valores[i] > maior) {
                maior = valores[i]; // ...atualiza o maior
            }
        }

        System.out.println("O maior valor digitado foi: " + maior);
        
        leitor.close();
    }
}
```
