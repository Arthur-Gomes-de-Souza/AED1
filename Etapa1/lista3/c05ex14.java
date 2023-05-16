package Etapa1.lista3;
import java.util.Scanner;
public class c05ex14 {
    public static void main(String[] args) {
        double tempo, velo, tempRel, veloLuz;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do tempo em segundos: ");
        tempo = teclado.nextDouble();
        System.out.println("Informe a velocidade em m/s: ");
        velo = teclado.nextDouble();
        veloLuz = 3*(Math.pow(10,8));
        tempRel = tempo*(1/(Math.sqrt(1-Math.pow(velo,2)/Math.pow(veloLuz,2))));
        System.out.printf("Valor do tempo relativo = %12.4f",tempRel);//no printf o 12 é o número de casas que o valor
        teclado.close();                                             // original ocupa, e o 4 é o número de casa decimais do novo formato

    }
}
