package AED1.Etapa2;

public class c09ex11B {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = aux*3-2;
            den = Math.sqrt(aux*3+4);
            serie += num / den;
        }
        serie = (5/3.0) * serie;
        System.out.println("Valor da serie = "+ serie);
    }
}
