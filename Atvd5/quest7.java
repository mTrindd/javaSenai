package java_Senai.Atvd5;

import java.util.Scanner;
public class quest7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número N: ");
            int n = scanner.nextInt();

            int i = 1;
            int soma = 0;

            while (i <= n) {
                soma += i;
                i++;
            }

            System.out.println("A soma de 1 até " + n + " é: " + soma);

            scanner.close();
        }
    }
