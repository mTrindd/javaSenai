package java_Senai.Atvd7;

import java.util.Scanner;
public class quest15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

        while (senha != 1234) {
            System.out.print("Senha incorreta! Digite novamente: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso permitido!");
scanner.close();
    }
}
