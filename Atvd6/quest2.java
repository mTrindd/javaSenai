package java_Senai.Atvd6;

import java.util.Scanner;
public class quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a senha: ");
                String senha = scanner.nextLine();
            while (!senha.equals("1234")) {
                System.out.print("Senha Incorreta, tente novamente: ");
                senha = scanner.nextLine();
            }
            System.out.println("Acesso concedido!");
            scanner.close();
        }
    }
