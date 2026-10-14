package java_Senai.Atvd8;

import java.util.Scanner;
public class quest3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contador = 1;
            int qtdMultiplos4 = 0;

            while (contador <= 15) {
                System.out.print("Digite o " + contador + "º número: ");
                int numero = scanner.nextInt();

                if (numero % 4 == 0) {
                    qtdMultiplos4++;
                }

                contador++;
            }

            System.out.println("Total de múltiplos de 4 digitados: " + qtdMultiplos4);

            scanner.close();
        }
    }
