package java_Senai.Atvd5;

import java.util.Scanner;
public class quest5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número limite: ");
            int limite = scanner.nextInt();

            int i = 0;
            while (i <= limite) {
                System.out.println(i);
                i += 5;
            }

            scanner.close();
        }
    }
