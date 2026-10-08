package java_Senai.Atvd7;

import java.util.Scanner;

public class quest19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int soma = 0;
            int contador = 0;
        System.out.print("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();
        while (numero != 0) {
            if (numero > 100) {
                soma += numero;
                contador++;
            }
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos números maiores que 100: " + media);
        } else {
            System.out.println("Nenhum número maior que 100 foi digitado.");
        }
        scanner.close();
    }
}
