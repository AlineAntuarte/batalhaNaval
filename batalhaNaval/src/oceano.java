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
    static char[][] tabuleiroGrafico = new char[5][5];
    static String player = "Marinheiro(a)";
    static Scanner user = new Scanner(System.in);
    static int linhaPlayer = 0;
    static int colunaPlayer = 0;
    static boolean travaNavio = true;

    public static void main(String[] args) throws Exception {

        // 1. Vou cobrir ele de "água" onde os navios ficam (~)

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

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                tabuleiroGrafico[linha][coluna] = '~';
            }
        }

        // 2. Exibição do tabuleiro na tela
        System.out.println("--- Batalha Naval ---");
        System.out.println("Como quer ser chamado? ");
        System.out.print("Seu nome: ");
        player = user.nextLine();
        if (player == "" || player == " ") {
            player = "Marinheiro(a)"; // Caso o usuário não queira informar o nome e pule a etapa ou deixe em branco,
                                      // ele ainda terá um "apelido" para jogar como perfil
        }

        System.out.println(); // Um sout extra executado "vazio" para pular uma linha

        System.out.println("Olá Comandante " + player + "! É um prazer velejar com você.");
        System.out.println("Vamos começar!");
        System.out.println(); // Um sout extra executado "vazio" para pular uma linha

        exibirTabuleiro(tabuleiroGrafico); // Exibe tabuleiro GRÁFICO
        criandoNavio();
        boolean trava = true; // Futuramente algo deve retornar false para o jogo terminar
        jogo: while (trava) {

            // Jogo rodando
            System.out.println(); // Um sout extra executado "vazio" para pular uma linha
            System.out.println("Jogador " + player + " deve informar de 0 a 4...");
            System.out.print("a Linha: ");
            linhaPlayer = user.nextInt();
            System.out.print("e a Coluna: ");
            colunaPlayer = user.nextInt();

            /*
             * --> legenda <--
             * mar ~~~~~~~~ AMBOS
             * navio ####### LÓGICO
             * explosão nula XXXXXXX GRÁFICO
             * navio abatido ****** GRÁFICO
             */

            if (tabuleiro[linhaPlayer][colunaPlayer] == '~') {// Se tiver água
                tabuleiro[linhaPlayer][colunaPlayer] = 'X'; // Manter atualizado para lógica
                tabuleiroGrafico[linhaPlayer][colunaPlayer] = 'X'; // Modifica para mostrar que já atirou la
                System.out.println("O Comandante " + player + " acertou o mar!");
                // passarVez++;
                exibirTabuleiro(tabuleiroGrafico);

            } else if (tabuleiro[linhaPlayer][colunaPlayer] == '#') {// Se tiver um navio
                tabuleiro[linhaPlayer][colunaPlayer] = '*'; // Manter atualizado para lógica
                tabuleiroGrafico[linhaPlayer][colunaPlayer] = '*'; // Modifica para mostrar que já abateu la
                System.out.println("Comandante " + player + ", acertamos o inimigo!");
                System.out.println(); // Um sout extra executado "vazio" para pular uma linha
                exibirTabuleiro(tabuleiroGrafico);

                /*
                 * Até aqui só novidade, agora teremos navios abatidos ou mar que já levou tiro
                 */

            } else if (tabuleiro[linhaPlayer][colunaPlayer] == 'X') {// Se já recebeu um tiro em água
                System.out.println("Nestas coordenadas não há navios inimigos Comandante!");
                exibirTabuleiro(tabuleiroGrafico);
            } else { // Se achar navio abatido
                System.out.println("Já abatemos este navio Comandante!");
                exibirTabuleiro(tabuleiroGrafico);
            }
            int cont = 0; /*
                           * Contador para encerrar o jogo, pois todos os navios foram abatidos. ALém
                           * disso ele é zerado dentro do loop 'While' pois uma nova contagem é feita a
                           * cada rodada, para evitar que ele conte o mesmo navio e acumule.
                           * O jogo só encerra quando o loop achar 3 navios abatidos de uma vez.
                           */

            for (int linha = 0; linha < 5; linha++) {
                for (int coluna = 0; coluna < 5; coluna++) {
                    if (tabuleiroGrafico[linha][coluna] == '*') {
                        cont++;
                        if (cont == 3) { // Condição de requisito para travar o jogo
                            System.out.println();
                            System.out.println("--- Vitória :) ---");
                            break jogo;
                        }
                    }
                }

            }

        }

        // ========================================================================
    }

    public static void exibirTabuleiro(char[][] mapa) {// 'mapa' apelido temporário para que a função seja 'universal'
        // Aqui é onde foi "contruído" a ordem de exibir o tabuleiro
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(mapa[linha][coluna] + "  ");
            }
            System.out.println(); // Um sout extra executado "vazio" para pular uma linha após imprimir 5 colunas
        }
    }

    public static void criandoNavio() {
        Random gerador = new Random();

        int naviol1 = gerador.nextInt(5);
        int navioc1 = gerador.nextInt(5);

        int naviol2 = gerador.nextInt(5);
        int navioc2 = gerador.nextInt(5);

        int naviol3 = gerador.nextInt(5);
        int navioc3 = gerador.nextInt(5);

        // Tabuleiro Recebendo os Navios

        navioAleatorio: while (travaNavio) {
            if ((naviol2 == naviol1 && navioc2 == navioc1) || (naviol2 == naviol3 && navioc2 == navioc3)) {
                naviol2 = gerador.nextInt(5);
                navioc2 = gerador.nextInt(5);
            } else if ((naviol3 == naviol1 && navioc3 == navioc1) || (naviol3 == naviol2 && navioc3 == navioc2)) {
                naviol3 = gerador.nextInt(5);
                navioc3 = gerador.nextInt(5);
            } else {
                break navioAleatorio;
            }
        }
        tabuleiro[naviol1][navioc1] = '#';
        tabuleiro[naviol2][navioc2] = '#';
        tabuleiro[naviol3][navioc3] = '#';
    }

}
