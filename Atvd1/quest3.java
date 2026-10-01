package java_Senai.Atvd1;

import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
            String nome = scanner.nextLine();

        System.out.print("Digite o 1º valor: ");
            double valor1 = scanner.nextDouble();

        System.out.print("Digite o 2º valor: ");
            double valor2 = scanner.nextDouble();

            if (valor2 == 0) {
        System.out.println("Erro: Não é possível dividir por zero.");
            } else {
                double divisao = valor1 / valor2;

        System.out.println("\nNome: " + nome);
        System.out.println("Resultado da divisão: " + divisao);
            }

            scanner.close();
        }
    }

