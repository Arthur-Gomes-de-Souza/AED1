package Etapa2;

public class c08ex23 {
    public static void main(String[] args) {
        double media;
        int somaPalin = 0, contPalin = 0;

        for (int aux = 1000; aux <= 9999; aux++) {
            if (aux / 1000 == aux % 10 && aux /100 %10 == aux %100 / 10) {
                System.out.println(aux);
                somaPalin += aux;
                contPalin++;
            }
        }
        media = (float) somaPalin / contPalin;
        System.out.println("Media = " + media);
    }
}
