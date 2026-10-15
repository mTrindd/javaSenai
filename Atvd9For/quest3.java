package java_Senai.Atvd9For;

import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número N: ");
            int n = scanner.nextInt();

            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
            scanner.close();
        }
    }
