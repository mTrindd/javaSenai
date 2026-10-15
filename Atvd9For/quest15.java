package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 0;

            for (int i = 1; i <= 8; i++) {
                System.out.print("Digite o número " + i + ": ");
                double num = scanner.nextDouble();
                if (num > 50) {
                    contador++;
                }
            }

            System.out.println("Quantidade de números maiores que 50: " + contador);
            scanner.close();
        }
    }
