package lista5;
import java.util.Scanner;
public class c07ex03 {
    public static void main(String[] args) {
        double valorImposto, multa;
        int diasAtraso;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do imposto: ");
        valorImposto = teclado.nextDouble();
        System.out.println("Informe o numero de dias de atraso: ");
        diasAtraso = teclado.nextInt();
        switch (diasAtraso){
            case 1,2,3,4,5 ->
                multa= 0;
            case 6,7,8 ->
                multa= 0.02*valorImposto;
            case 9,10 ->
                multa= valorImposto*0.10+(0.5*diasAtraso) ;
            default ->
                multa= 1.5*valorImposto+diasAtraso;
        }
        System.out.printf("Multa = R$ %.2f",multa);
        teclado.close();
    }
}
