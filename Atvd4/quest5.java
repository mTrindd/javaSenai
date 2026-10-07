package java_Senai.Atvd4;

import java.util.Scanner;
public class quest5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
                double numero = scanner.nextDouble();
            String resultado = (numero >= 100 && numero <= 200)
                    ? "O número está entre 100 e 200."
                    : (numero < 100
                    ? "O número é MENOR que o intervalo (menor que 100)."
                    : "O número é MAIOR que o intervalo (maior que 200).");

            System.out.println(resultado);

scanner.close();
        }
    }
