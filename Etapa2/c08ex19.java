package Etapa2;

public class c08ex19 {
    public static void main(String[] args) {
        double termos, somaTermos = 0;
        for (int aux = 1; aux <= 100; aux++) {
            termos = Math.pow(aux,2);
            somaTermos += termos;
            System.out.printf("%.0f" ,termos);
            System.out.println();
        }
        System.out.println("Soma dos 100 primeiros termos = " + somaTermos);
    }
}
