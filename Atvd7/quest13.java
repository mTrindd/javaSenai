package java_Senai.Atvd7;

import java.util.Scanner;
public class quest13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int qtd = 0;
            int soma = 0;
        System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();
        while (numero != 0) {
            qtd++;
            soma += numero;
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Total de números digitados: " + qtd);
        System.out.println("Soma total: " + soma);
        if (qtd > 0) {
            double media = (double) soma / qtd;
            System.out.println("Média: " + media);
        }

scanner.close();
    }
}
