package java_Senai.Atvd7;

import java.util.Scanner;
public class quest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int somaPares = 0;
            int somaImpares = 0;

        System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        scanner.close();
    }
}
