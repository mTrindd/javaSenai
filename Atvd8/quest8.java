package java_Senai.Atvd8;

import java.util.Scanner;

public class quest8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 1;

            while (contador <= 10) {
                System.out.print("Digite o " + contador + "º número: ");
                int numero = scanner.nextInt();

                int ultimoDigito = Math.abs(numero) % 10;

                if (ultimoDigito == 0 || ultimoDigito == 5) {
                    System.out.println("O último dígito do número é " + ultimoDigito);
                } else {
                    System.out.println("O último dígito é " + ultimoDigito + " (Outro valor)");
                }

                contador++;
            }

            scanner.close();
        }
    }
