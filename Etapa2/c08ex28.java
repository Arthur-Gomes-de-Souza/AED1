package AED1.Etapa2;
public class c08ex28 {
    public static void main(String[] args) {
        int resultado, cont =0;
        double media, soma = 0;
       for (int aux=1;aux<=1000;aux++) {
           resultado = aux * (aux+1) * (aux+2);
           if (resultado <= 1000) {
               cont++;
               System.out.println(resultado);
               soma += resultado;
           }
       }
       media = soma / cont;
        System.out.println("Media = " + media);
    }
}
