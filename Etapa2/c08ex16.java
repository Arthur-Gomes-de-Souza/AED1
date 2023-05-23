package AED1.Etapa2;

public class c08ex16 {
    public static void main(String[] args) {
        double media;
        int somaImpares = 0, contImpares = 0;
        for (int aux = 1000; aux <= 2000; aux++) {
            if (aux % 2 != 0) {
                somaImpares += aux;
                contImpares++;
            }
        }
        media = (float) somaImpares / contImpares;
        System.out.println("Media dos numeros impares = " + media);
    }
}
