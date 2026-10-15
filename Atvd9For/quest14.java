package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double somaPositivos = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite o número " + i + ": ");
                double num = scanner.nextDouble();
                if (num > 0) {
                    somaPositivos += num;
                }
            }

            System.out.println("Soma dos números positivos: " + somaPositivos);
            scanner.close();
        }
    }
