package java_Senai.Atvd5;

import java.util.Scanner;
public class quest8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int i = 1;
            double soma = 0;

            while (i <= 5) {
                System.out.print("Digite a " + i + "ª nota: ");
                double nota = scanner.nextDouble();
                soma += nota;
                i++;
            }

            double media = soma / 5;
            System.out.println("A média aritmética das notas é: " + media);

            scanner.close();
        }
    }
