package java_Senai.Atvd5;

public class quest9 {
    public static void main(String[] args) {
        int i = 2;
        int soma = 0;

        while (i <= 50) {
            soma += i;
            i += 2;
        }

        System.out.println("A soma dos números pares entre 1 e 50 é: " + soma);
    }
}
