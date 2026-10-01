package java_Senai.Atvd2v2;

import java.util.Scanner;
public class quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    final int PONTOS_POR_VITORIA_JOGADOR_1 = 10;
    final int PONTOS_POR_VITORIA_JOGADOR_2 = 5;
        System.out.print("Digite o número de vitórias do Jogador 1: ");
            int vitoriasJogador1 = scanner.nextInt();

        System.out.print("Digite o número de vitórias do Jogador 2: ");
            int vitoriasJogador2 = scanner.nextInt();
            int pontuacaoJogador1 = vitoriasJogador1 * PONTOS_POR_VITORIA_JOGADOR_1;
            int pontuacaoJogador2 = vitoriasJogador2 * PONTOS_POR_VITORIA_JOGADOR_2;
        System.out.println();
        System.out.println("Vitórias do jogador 1: " + vitoriasJogador1);
        System.out.println("Vitórias do jogador 2: " + vitoriasJogador2);
        System.out.println("Pontuação do jogador 1: " + pontuacaoJogador1 + " pontos");
        System.out.println("Pontuação do jogador 2: " + pontuacaoJogador2 + " pontos");

scanner.close();
    }
}