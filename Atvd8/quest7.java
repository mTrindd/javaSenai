package java_Senai.Atvd8;

public class quest7 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("A soma de todos os múltiplos de 3 ou 5 de 1 a 100 é: " + soma);
    }
}
