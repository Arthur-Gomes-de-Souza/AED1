package AED1.Etapa2;

public class c09ex11D {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = Math.pow(aux,3);
            den = Math.pow(10,aux-1);
            serie += num / den;
        }
        System.out.println("Valor da serie = "+ serie);
    }
}
