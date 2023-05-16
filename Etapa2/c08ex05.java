package Etapa2;
import java.util.Scanner;
public class c08ex05 {
    public static void main(String[] args) {
        int voto, cont1 = 0, cont2 = 0, cont3 = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 100; aux++) {
            System.out.println("Insira seu voto: ");
            voto = teclado.nextInt();
            switch (voto) {
                case 1 ->
                    cont1++;
                case 2 ->
                    cont2++;
                case 3 ->
                    cont3++;
            }
        }
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("Candidato vencedor: Fulano" + "\nVotos obtidos: " + cont1);
        }
        else {
            if (cont2 > cont1 && cont2 > cont3) {
                System.out.println("Candidato vencedor: Ciclano" + "\nVotos obtidos: " + cont2);
            }
            else {
                System.out.println("Candidato vencedor: Beltrano" + "\nVotos obtidos: " + cont3);
            }
        }
        teclado.close();
    }
}
