package AED1.Etapa2;

public class c09ex11C {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = (aux*2+1) * Math.sqrt(aux*4+1);
            den = Math.pow(5,aux);
            serie += num / den;
        }
        serie = Math.pow(serie,2);
        System.out.println("Valor da serie = "+ serie);
    }
}
