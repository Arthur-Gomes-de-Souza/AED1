package AED1.Etapa2;
public class c08ex24 {
    public static void main(String[] args) {
        double serie, soma = 0;
        for (int aux = 1; aux <= 99; aux+=2) {
            soma += Math.pow(2, aux);
        }
        serie = (1 / 3.0) * soma;
        System.out.println("Valor da serie = " + serie);
    }
}
