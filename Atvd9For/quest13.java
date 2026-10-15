package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int pares = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o número " + i + ": ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    pares++;
                }
            }

            System.out.println("Quantidade de números pares: " + pares);
            scanner.close();
        }
    }
