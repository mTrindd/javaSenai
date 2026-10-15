package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número 1: ");
            double menor = scanner.nextDouble();

            for (int i = 2; i <= 5; i++) {
                System.out.print("Digite o número " + i + ": ");
                double num = scanner.nextDouble();
                if (num < menor) {
                    menor = num;
                }
            }

            System.out.println("O menor número digitado foi: " + menor);
            scanner.close();
        }
    }
