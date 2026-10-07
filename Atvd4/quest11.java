package java_Senai.Atvd4;

import java.util.Scanner;
public class quest11 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();
                boolean ehPar = (numero % 2 == 0);
                boolean ehImpar = !ehPar;
            if (ehPar && numero < 100) {
                System.out.println("O número " + numero + " atende à condição: é PAR e MENOR que 100.");
            } else if (ehImpar && numero > 100) {
                System.out.println("O número " + numero + " atende à condição: é ÍMPAR e MAIOR que 100.");
            } else {
                System.out.println("O número " + numero + " NÃO atende a nenhuma das duas condições.");
            }
scanner.close();
        }
    }
