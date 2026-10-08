package java_Senai.Atvd7;

import java.util.Scanner;
public class quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();

        while (numero != 0) {
            int dobro = numero * 2;
            System.out.println("O dobro de " + numero + " é: " + dobro);
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

scanner.close();
    }
}
