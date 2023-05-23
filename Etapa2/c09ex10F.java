package AED1.Etapa2;

public class c09ex10F {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = Math.pow(aux,2);
            den = Math.pow(aux*2,2);
            serie += num / den;
        }
        System.out.println("Valor da serie = "+ serie);
    }
}
