package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            System.out.print("Divisores de " + num + ": ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            scanner.close();
        }
    }
