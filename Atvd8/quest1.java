package java_Senai.Atvd8;

import java.util.Scanner;
public class quest1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 1;

            while (contador <= 20) {
                System.out.print("Digite o " + contador + "º número: ");
                int numero = scanner.nextInt();

                int resto = numero % 2;

                if (resto == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }

                contador++;
            }

            scanner.close();
        }
    }
