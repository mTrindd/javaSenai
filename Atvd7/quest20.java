package java_Senai.Atvd7;

import java.util.Scanner;

public class quest20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double totalCompra = 0;
        System.out.print("Digite o valor do produto (0 para finalizar): ");
            double valorProduto = scanner.nextDouble();

        while (valorProduto != 0) {
            totalCompra += valorProduto;
            System.out.print("Digite o valor do produto (0 para finalizar): ");
            valorProduto = scanner.nextDouble();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);

        double valorFinal = totalCompra;
        if (totalCompra > 500) {
            double desconto = totalCompra * 0.10;
            valorFinal = totalCompra - desconto;
            System.out.printf("Desconto aplicado (10%%): R$ %.2f\n", desconto);
        }

        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}
