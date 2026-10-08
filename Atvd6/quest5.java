package java_Senai.Atvd6;

import java.util.Scanner;

public class quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double total = 0.0;
        System.out.print("Digite o preço do produto (valor negativo para encerrar): R$ ");
            double preco = scanner.nextDouble();
        while (preco >= 0) {
                total += preco;
                System.out.print("Digite o preço do próximo produto (valor negativo para encerrar): R$ ");
                preco = scanner.nextDouble();
            }
            System.out.printf("Total da compra: R$ %.2f\n", total);
            scanner.close();
        }
    }
