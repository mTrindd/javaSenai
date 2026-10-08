package java_Senai.Atvd6;

import java.util.Scanner;
public class quest3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 1;
            int qtdNegativos = 0;

            while (contador <= 10) {
                System.out.print("Digite o " + contador + "º número: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    qtdNegativos++;
                }

                contador++;
            }

            System.out.println("Total de números negativos digitados: " + qtdNegativos);
            scanner.close();
        }
    }
