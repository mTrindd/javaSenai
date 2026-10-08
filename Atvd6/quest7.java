package java_Senai.Atvd6;

import java.util.Scanner;

public class quest7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro não negativo: ");
                int num = scanner.nextInt();

                long fatorial = 1;
                int i = num;

                while (i > 1) {
                fatorial *= i;
                i--;
            }

            System.out.println("O fatorial de " + num + " é: " + fatorial);
            scanner.close();
        }
    }
