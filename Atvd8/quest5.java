package java_Senai.Atvd8;

import java.util.Scanner;

public class quest5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String continuar = "S";

            while (continuar.equalsIgnoreCase("S")) {
                System.out.print("Digite o valor de N: ");
                int n = scanner.nextInt();

                System.out.print("Digite o divisor D: ");
                int d = scanner.nextInt();

                if (d != 0) {
                    if (n % d == 0) {
                        System.out.println(n + " é divisível por " + d);
                    } else {
                        System.out.println(n + " NÃO é divisível por " + d);
                    }
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }

                System.out.print("Deseja testar outro par? (S/N): ");
                continuar = scanner.next();
            }

            scanner.close();
        }
    }
