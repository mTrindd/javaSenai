package java_Senai.Atvd7;

import java.util.Scanner;
public class quest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int contador = 0;

        System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 5 == 0) {
                contador++;
            }
        System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Quantidade de múltiplos de 5: " + contador);
        scanner.close();
    }
}
