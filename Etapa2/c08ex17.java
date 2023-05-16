package Etapa2;

public class c08ex17 {
    public static void main(String[] args) {
        double fx;
        for (int x = 3; x <= 12; x++) {
            fx = Math.sqrt(Math.pow(x,2) - 3);
            System.out.print("x = "+ x);
            System.out.printf("   f(x) = %.4f" , fx);
            System.out.println();
        }
    }
}
