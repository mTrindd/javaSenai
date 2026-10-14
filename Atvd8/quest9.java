package java_Senai.Atvd8;

import java.util.Scanner;

public class quest9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numeroSecreto = 42;
            int palpite = 0;

            while (palpite != numeroSecreto) {
                System.out.print("Digite o seu palpite: ");
                palpite = scanner.nextInt();

                if (palpite != numeroSecreto) {
                    // Dica de Maior/Menor
                    if (palpite < numeroSecreto) {
                        System.out.println("Dica: O número secreto é MAIOR.");
                    } else {
                        System.out.println("Dica: O número secreto é MENOR.");
                    }

                    // Dica de Paridade
                    if (palpite % 2 == 0) {
                        System.out.println("Nota: O seu palpite é PAR.");
                    } else {
                        System.out.println("Nota: O seu palpite é ÍMPAR.");
                    }
                }
            }

            System.out.println("Parabéns! Você acertou o número secreto (" + numeroSecreto + ")!");

            scanner.close();
        }
    }
