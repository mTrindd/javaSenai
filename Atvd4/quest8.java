package java_Senai.Atvd4;

import java.util.Scanner;
public class quest8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o peso em kg (ex: 70.5): ");
                double peso = scanner.nextDouble();

            System.out.print("Digite a altura em metros (ex: 1.75): ");
                double altura = scanner.nextDouble();
                double imc = peso / (altura * altura);

            System.out.printf("Seu IMC é: %.2f%n", imc);
            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso");
            } else if (imc >= 18.5 && imc < 25.0) {
                System.out.println("Classificação: Peso ideal (normal)");
            } else if (imc >= 25.0 && imc < 30.0) {
                System.out.println("Classificação: Sobrepeso");
            } else if (imc >= 30.0 && imc < 35.0) {
                System.out.println("Classificação: Obesidade Grau I");
            } else if (imc >= 35.0 && imc < 40.0) {
                System.out.println("Classificação: Obesidade Grau II");
            } else {
                System.out.println("Classificação: Obesidade Grau III (Mórbida)");
            }

            scanner.close();
        }
    }
