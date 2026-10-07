package java_Senai.Atvd4;

import java.util.Scanner;
public class quest6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
            System.out.print("Digite a operação (+, -, *, /): ");
                char operacao = scanner.next().charAt(0);
            System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
            switch (operacao) {
                case '+':
            System.out.println("Resultado: " + (num1 + num2));
                    break;
                case '-':
            System.out.println("Resultado: " + (num1 - num2));
                    break;
                case '*':
            System.out.println("Resultado: " + (num1 * num2));
                    break;
                case '/':
            String resultadoDivisao = (num2 != 0)
                            ? "Resultado: " + (num1 / num2)
                            : "Erro: Divisão por zero não é permitida.";
            System.out.println(resultadoDivisao);
                    break;

                default:
            System.out.println("Erro: Operação inválida!");
                    break;
            }

            scanner.close();
        }
    }
