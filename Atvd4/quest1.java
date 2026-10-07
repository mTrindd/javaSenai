package java_Senai.Atvd4;

import java.util.Scanner;

public class quest1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

            System.out.print("Digite o terceiro número: ");
                double n3 = scanner.nextDouble();
                double maior = n1;

            if (n2 > maior) {
                maior = n2;
            }

            if (n3 > maior) {
                maior = n3;
            }

            System.out.println("O maior número é: " + maior);

scanner.close();
        }
    }
