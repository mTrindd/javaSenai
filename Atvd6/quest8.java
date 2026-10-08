package java_Senai.Atvd6;

public class quest8 {
    public static void main(String[] args) {
        double popA = 1000.0;
        double popB = 1500.0;
        int anos = 0;

        while (popA <= popB) {
            popA += popA * 0.02;
            popB += popB * 0.01;
            anos++;
        }

        System.out.println("A cidade A passará a cidade B em " + anos + " anos.");
    }
}
