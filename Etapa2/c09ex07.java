package AED1.Etapa2;

public class c09ex07 {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=6;aux++) {
            num = (aux*2-2) + (aux*3);
            den = aux*6+1;
            serie += num/den;
        }
        System.out.println("Valor da serie = "+ serie);
    }
}
