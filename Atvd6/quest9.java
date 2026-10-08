package java_Senai.Atvd6;

import java.util.Scanner;

public class quest9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int soma = 0;
                int contador = 0;

            System.out.print("Digite uma idade (0 para parar): ");
                int idade = scanner.nextInt();

                while (idade != 0) {
                soma += idade;
                contador++;
                System.out.print("Digite outra idade (0 para parar): ");
                idade = scanner.nextInt();
            }

                if (contador > 0) {
                double media = (double) soma / contador;
                System.out.printf("A média de idade do grupo é: %.2f\n", media);
            } else {
                System.out.println("Nenhuma idade válida foi digitada.");
            }

            scanner.close();
        }
    }
