package java_Senai.Atvd7;

import java.util.Scanner;
public class quest17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int soma = 0;

        System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                soma += numero;
            }
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma dos números pares: " + soma);
        scanner.close();
    }
}
