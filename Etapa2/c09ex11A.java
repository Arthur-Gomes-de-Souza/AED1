package Etapa2;

public class c09ex11A {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = (aux) + (aux*7-6);
            den = Math.pow(2,aux*2-2);
            serie += num / den;
        }
        serie = Math.cbrt(serie);
        System.out.println("Valor da serie = "+ serie);
    }
}
