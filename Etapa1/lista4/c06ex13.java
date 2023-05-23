package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex13 {
    public static void main(String[] args) {
        int horaIni, minIni, horaFinal, minFinal, duracaoHoras, duracaoMin;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a hora inicial: ");
        horaIni= teclado.nextInt();
        System.out.println("Informe o minuto inicial: ");
        minIni= teclado.nextInt();
        System.out.println("Informe a hora final: ");
        horaFinal = teclado.nextInt();
        System.out.println("Informe o minuto final: ");
        minFinal = teclado.nextInt();
        //CALCULOS:
        if (horaFinal>=horaIni) {
            duracaoHoras = horaFinal-horaIni;
        }
        else {
            duracaoHoras = 24-horaIni+horaFinal;
        }
        if (minFinal>=minIni) {
            duracaoMin = minFinal-minIni;
        }
        else {
            duracaoMin = 60-minIni+minFinal;
            duracaoHoras--;
        }
        //SAIDA:
        System.out.println("O jogo durou "+duracaoHoras+" horas e "+duracaoMin+" minutos.");
        teclado.close();
    }
}
