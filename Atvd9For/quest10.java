package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double soma = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o número " + i + ": ");
                soma += scanner.nextDouble();
            }

            double media = soma / 5.0;
            System.out.println("A média dos números é: " + media);
            scanner.close();
        }
    }
