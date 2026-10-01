package java_Senai.Atvd1;

import java.util.Scanner;

public class quest5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
            double numero1 = scanner.nextDouble();

        System.out.print("Digite o 2º número: ");
            double numero2 = scanner.nextDouble();
            double diferenca = numero1 - numero2;

        System.out.println("A diferença (subtração) é: " + diferenca);

scanner.close();
        }
    }

