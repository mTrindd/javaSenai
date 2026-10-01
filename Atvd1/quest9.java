package java_Senai.Atvd1;

import java.util.Scanner;

public class quest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            double dobro = numero * 2;
            double triplo = numero * 3;
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);

scanner.close();
        }
    }

