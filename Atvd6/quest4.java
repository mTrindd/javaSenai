package java_Senai.Atvd6;

import java.util.Scanner;
public class quest4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número (0 para parar): ");
                int num = scanner.nextInt();

                while (num != 0) {
            System.out.println("Você digitou: " + num);
            System.out.print("Digite outro número (0 para parar): ");
                num = scanner.nextInt();
            }

            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
