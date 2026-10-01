package java_Senai.Atvd1;

import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o 1º valor: ");
            double v1 = scanner.nextDouble();
        System.out.print("Digite o 2º valor: ");
            double v2 = scanner.nextDouble();
        System.out.print("Digite o 3º valor: ");
            double v3 = scanner.nextDouble();
        System.out.print("Digite o 4º valor: ");
            double v4 = scanner.nextDouble();
        System.out.print("Digite o 5º valor: ");
                double v5 = scanner.nextDouble();

                if (v5 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero (o 5º valor é igual a 0).");
                } else {
                    double soma = v1 + v2 + v3 + v4;
                    double resultado = soma / v5;

                System.out.println("Soma dos 4 primeiros valores: " + soma);
                System.out.println("Resultado da divisão pelo 5º valor: " + resultado);
                }

                scanner.close();
            }
        }

