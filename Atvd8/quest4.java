package java_Senai.Atvd8;

import java.util.Scanner;
public class quest4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contador = 1;
            int qtdPares = 0;
            int qtdImpares = 0;

            while (contador <= 12) {
                System.out.print("Digite o " + contador + "º número: ");
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }

                contador++;
            }

            System.out.println("Total de números pares: " + qtdPares);
            System.out.println("Total de números ímpares: " + qtdImpares);

            scanner.close();
        }
    }
