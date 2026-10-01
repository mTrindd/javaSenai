package java_Senai.Atvd2v2;

import java.util.Scanner;
import java.util.Locale;
public class quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            final double PERCENTUAL_IMPOSTO = 0.10;
        System.out.print("Digite o salário bruto (R$): ");
            double salarioBruto = scanner.nextDouble();
            double valorImposto = salarioBruto * PERCENTUAL_IMPOSTO;
            double salarioLiquido = salarioBruto - valorImposto;
        System.out.println();
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto de 10%%: R$ %.2f%n", valorImposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

scanner.close();
        }
    }