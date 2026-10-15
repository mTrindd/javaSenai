package java_Senai.Atvd9For;

public class quest16 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
    }
}
