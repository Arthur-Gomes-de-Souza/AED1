package AED1.Etapa2;

public class c09ex12 {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=10000;aux++) {
            num = 1;
            den = aux*2-1;
            if (aux%2==0) {
                serie -= num/den;
            }
            else
                serie += num/den;

        }
        serie = 4 * serie;
        System.out.println("Valor da serie = "+ serie);
    }
}
