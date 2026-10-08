package java_Senai.Atvd6;

import java.util.Scanner;

public class quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a base: ");
                int base = scanner.nextInt();

            System.out.print("Digite o expoente (inteiro >= 0): ");
                int expoente = scanner.nextInt();

                long resultado = 1;
                int i = 1;

                while (i <= expoente) {
                resultado *= base;
                i++;
            }

            System.out.println(base + " elevado a " + expoente + " = " + resultado);
            scanner.close();
        }
    }
