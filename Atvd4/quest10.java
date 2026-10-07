package java_Senai.Atvd4;

import java.util.Scanner;
public class quest10 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a hora de início do jogo (0 a 23): ");
                int horaInicio = scanner.nextInt();
            System.out.print("Digite a hora de fim do jogo (0 a 23): ");
                int horaFim = scanner.nextInt();
                int duracao;
            if (horaFim <= horaInicio) {
                duracao = (24 - horaInicio) + horaFim;
            } else {
                duracao = horaFim - horaInicio;
            }
            System.out.println("A duração do jogo foi de " + duracao + " hora(s).");
scanner.close();
        }
    }
