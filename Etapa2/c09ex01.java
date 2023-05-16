package Etapa2;

public class c09ex01 {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux = 1; aux <=37;aux++) {
            num = aux*(aux+1);
            den = 38 - aux;
            serie += num / den;
        }
        System.out.println("Valor da serie = "+ serie);
    }
}
