package java_Senai.Atvd4;

import java.util.Scanner;
public class quest13 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número de 4 dígitos (ex: 3025): ");
                int numero = scanner.nextInt();
                if (numero < 1000 || numero > 9999) {
            System.out.println("Erro: Por favor, digite um número que contenha exatamente 4 dígitos.");
            } else {
                int doisPrimeiros = numero / 100; // Ex: 3025 / 100 = 30
                int doisUltimos = numero % 100;   // Ex: 3025 % 100 = 25

                int soma = doisPrimeiros + doisUltimos;
                int resultado = soma * soma; // Elevado ao quadrado
                System.out.println("\n--- Processamento ---");
                System.out.println("Primeira parte: " + doisPrimeiros);
                System.out.println("Segunda parte: " + doisUltimos);
                System.out.println("Soma: " + doisPrimeiros + " + " + doisUltimos + " = " + soma);
                System.out.println("Quadrado da soma: " + soma + "² = " + resultado);

                if (resultado == numero) {
                    System.out.println("\nO número " + numero + " É UM NÚMERO MÁGICO!");
                } else {
                    System.out.println("\nO número " + numero + " NÃO é um número mágico.");
                }
            }

    scanner.close();
        }
    }
