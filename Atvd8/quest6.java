package java_Senai.Atvd8;

import java.util.Scanner;

public class quest6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            int divisores = 0;
            int i = 1;

            while (i <= numero) {
                if (numero % i == 0) {
                    divisores++;
                }
                i++;
            }

            if (divisores == 2) {
                System.out.println("O número " + numero + " é PRIMO.");
            } else {
                System.out.println("O número " + numero + " NÃO é primo.");
            }

            scanner.close();
        }
    }
