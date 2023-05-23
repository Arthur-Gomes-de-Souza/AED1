package AED1.Etapa2;

public class c09ex10C {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = aux*2-1;
            den = aux*2;
            serie += num/den;
        }
        serie = (1/3.0) * Math.pow(serie,2);
        System.out.println("Valor da serie = "+ serie);
    }
}
