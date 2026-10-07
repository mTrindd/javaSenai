package java_Senai.Atvd4;

import java.util.Scanner;
public class quest14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Digite o salário (R$): ");
            double salario = scanner.nextDouble();

            double imposto = 0.0;
            double salarioLiquido;


            if (salario <= 2000.00) {
                imposto = 0.0; // Isento
                System.out.println("\nFaixa de Imposto: Isento");
            } else if (salario <= 5000.00) {
                imposto = salario * 0.10; // 10% de imposto
                System.out.println("\nFaixa de Imposto: 10%");
            } else {
                imposto = salario * 0.20; // 20% de imposto
                System.out.println("\nFaixa de Imposto: 20%");
            }
            salarioLiquido = salario - imposto;
            System.out.printf("Valor do Imposto: R$ %.2f%n", imposto);
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
scanner.close();
        }
    }
