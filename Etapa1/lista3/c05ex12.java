package AED1.Etapa1.lista3;
import java.util.Scanner;
public class c05ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempEvent, seg, min, horas;
        System.out.println("Informe o tempo de duracao do evento em segundos: ");
        tempEvent = teclado.nextInt();
        horas = tempEvent/3600;
        min = (tempEvent-horas*3600)/60;
        seg = tempEvent%60;
        System.out.println("Horas = "+horas+" Minutos = "+min+" Segundos = "+seg);
        teclado.close();
    }
}
