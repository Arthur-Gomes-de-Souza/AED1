package AED1.Etapa2;
//rever
public class c09ex13 {
    public static void main(String[] args) {
        double serie = 0,den,fatorial = 1;

        for (int aux=1;aux<=10;aux++) {
            den = Math.pow(2,aux) - 1;
            fatorial *= aux;
            serie += fatorial/den;
        }
        System.out.println("Valor da serie = "+ serie);
    }
}
