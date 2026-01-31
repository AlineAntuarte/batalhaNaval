import java.util.Scanner;
import java.util.Random;

public class oceano {
    /*
     * O Segredo: O "Game Loop" (O Ciclo do Jogo)
     * Diferente dos exercícios de aula que começam e terminam, um jogo funciona em
     * um laço (loop). Ele fica rodando até que alguém vença.
     * 
     * Vamos montar o Passo 1: Criar e Ver o Tabuleiro.
     */
    // 1. Criei o tabuleiro fora do Main e dentro da classe, para pertencer a
    // "todos"
    static char[][] tabuleiro = new char[5][5];
    static String player = "Marinheiro(a)";
    static Scanner user = new Scanner(System.in);
    static int linhaPlayer = 0;
    static int colunaPlayer = 0;

    public static void main(String[] args) throws Exception {

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
        System.out.println("Como quer ser chamado? ");
        player = user.nextLine();

        System.out.println("Olá Comandante " + player + "! É um prazer velejar com você.");
        System.out.println("Vamos começar!");

        exibirTabuleiro(tabuleiro);

        boolean trava = true; // Futuramente algo deve retornar false para o jogo terminar
        while (trava) {
            // Jogo rodando
            System.out.println("Jogador " + player + " deve informar...");
            System.out.print("Linha: ");
            linhaPlayer = user.nextInt();
            System.out.print("Coluna: ");
            colunaPlayer = user.nextInt();

            // Jogo encerrando
        }
        if (trava == false) { // Quando o jogo acaba ele retorna quem venceu
            System.out.println("--- Vitória :) ---");
            System.out.println("--- Derrota :( ---");

        }

        criandoNavio(navio);

        // ========================================================================
    }

    public static void exibirTabuleiro(char[][] mapa) {
        // Aqui é onde foi "contruído" a ordem de exibir o tabuleiro
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(mapa[linha][coluna] + "  ");
            }
            System.out.println(); // Um sout extra executado "vazio" para pular uma linha após imprimir 5 colunas
        }
    }

    public static void criandoNavio(char[][] navio) {
        Random gerador = new Random();

        int naviol1 = 0;
        int navioc1 = 0;
        int naviol2 = 0;
        int navioc2 = 0;
        int naviol3 = 0;
        int navioc3 = 0;

        naviol1 = gerador.nextInt(5);
        navioc1 = gerador.nextInt(5);
        naviol2 = gerador.nextInt(5);
        navioc2 = gerador.nextInt(5);
        naviol3 = gerador.nextInt(5);
        navioc3 = gerador.nextInt(5);

        // Mapa Recebendo os Navios

        tabuleiro[naviol1][navioc1] = '#';
        tabuleiro[naviol2][navioc2] = '#';
        tabuleiro[naviol3][navioc3] = '#';

        /*
         * for (int linha = 0; linha < 5; linha++) {
         * for (int coluna = 0; coluna < 5; coluna++) {
         * navio[linha][coluna] = '~';
         * }
         * }
         * 
         * for (int i = 0; i < 2; i++) {
         * if (i == 0) {
         * // Linha
         * int linha = 0;
         * 
         * } else {
         * // Coluna
         * }
         * }
         */

    }

}
