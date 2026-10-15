package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest20 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int aprovados = 0;
            int reprovados = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                double nota = scanner.nextDouble();

                if (nota >= 7.0) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            System.out.println("Total de aprovados: " + aprovados);
            System.out.println("Total de reprovados: " + reprovados);
            scanner.close();
        }
    }
