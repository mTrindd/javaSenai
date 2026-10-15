package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número 1: ");
            double maior = scanner.nextDouble();

            for (int i = 2; i <= 5; i++) {
                System.out.print("Digite o número " + i + ": ");
                double num = scanner.nextDouble();
                if (num > maior) {
                    maior = num;
                }
            }

            System.out.println("O maior número digitado foi: " + maior);
            scanner.close();
        }
    }
