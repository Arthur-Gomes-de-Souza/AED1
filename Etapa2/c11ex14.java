package Etapa2;

public class c11ex14 {
    public static void main(String[] args) {
        double conta=0,num,den,serie,cont=0;
        do {
            cont++;
            num = 1;
            den = cont*2-1;
            if (cont%2==0) {
                conta -= num/den;
            }
            else
                conta += num/den;
            serie = 4* conta;
        } while (!(serie > 3.1416 && serie < 3.1417));
        System.out.println("Termos = "+cont);
    }
}
