package AED1.Etapa2;

public class c09ex11E {
    public static void main(String[] args) {
        double serie = 0, num, den;

        for (int aux=1;aux<=100;aux++) {
            num = (Math.pow(aux,2)) * Math.sqrt(aux*2+3);
            den = Math.pow(aux+1,aux);
            serie += num / den;
        }
        serie = (2/3.0) * serie;
        System.out.println("Valor da serie = "+ serie);
    }
}
