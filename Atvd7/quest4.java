package java_Senai.Atvd7;

import java.util.Scanner;
public class quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int soma = 0;
            int contador = 0;

        System.out.print("Digite um número (negativo para sair): ");
            int numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            contador++;
            System.out.print("Digite um número (negativo para sair): ");
            numero = scanner.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos números positivos: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

scanner.close();
    }
}
