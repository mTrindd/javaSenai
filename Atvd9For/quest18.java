package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            int divisores = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(num + " é um número primo.");
            } else {
                System.out.println(num + " não é um número primo.");
            }
            scanner.close();
        }
    }
