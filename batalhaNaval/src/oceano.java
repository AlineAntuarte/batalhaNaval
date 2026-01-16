import java.util.Scanner;
import java.util.Random;

public class oceano {
    public static void main(String[] args) throws Exception {

        /*
         * O Segredo: O "Game Loop" (O Ciclo do Jogo)
         * Diferente dos exercícios de aula que começam e terminam, um jogo funciona em
         * um laço (loop). Ele fica rodando até que alguém vença.
         * 
         * Vamos montar o Passo 1: Criar e Ver o Tabuleiro.
         */
        // 1. Criei o tabuleiro
        char[][] tabuleiro = new char[5][5];
        // 1.1 Criei um compartimento para os navios
        char[][] navio = new char[1][1];

        // 2. Vou cobrir ele de "água" onde os navios ficam (~)

        /*
         * O loop entra primeiramente na linha, mas sua linha seguinte tem outro loop,
         * por isso apenas ao terminar de percorrer todas as colunas ele pula para a
         * próxima linha. O inverso também pode ser feito.
         */
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                tabuleiro[linha][coluna] = '~';
            }
        }

        // 3. Exibição do tabuleiro na tela
        System.out.println("--- Batalha Naval ---");

        exibirTabuleiro(tabuleiro);
    }

    public static void exibirTabuleiro(char[][] mapa) {
        // Aqui é onde foi "contruído" a ordem de exibir o tabuleiro
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(mapa[linha][coluna] + " ");
            }
            System.out.println(); // Um sout extra executado "vazio" para pular uma linha após imprimir 5 colunas
        }
    }

    public static void criandoNavio(char[][] navio) {
        Random gerador = new Random(); // Inicialize o gerador aqui

        int naviol1 = 0;
        int navioc1 = 0;
        int naviol2 = 0;
        int navioc2 = 0;
        int naviol3 = 0;
        int navioc3 = 0;

        naviol1 = gerador.nextInt(5);
        System.out.println(naviol1);

        navioc1 = gerador.nextInt(5);
        System.out.println(navioc1);

        naviol2 = gerador.nextInt(5);
        System.out.println(naviol2);

        navioc2 = gerador.nextInt(5);
        System.out.println(navioc2);

        naviol3 = gerador.nextInt(5);
        System.out.println(naviol3);

        navioc3 = gerador.nextInt(5);
        System.out.println(navioc3);

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                navio[linha][coluna] = '~';
            }
        }

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                // Linha
                int linha = 0;

            } else {
                // Coluna
            }
        }

    }

}
