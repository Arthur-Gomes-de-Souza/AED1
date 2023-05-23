package AED1.Etapa1.lista3;
import java.util.Scanner;
public class c05ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numCheq, banco, agc, seq;
        System.out.println("Informe o numero do cheque: ");
        numCheq = teclado.nextInt();
        banco = numCheq/1000000;
        agc = numCheq/1000%1000;
        seq = numCheq%1000;
        System.out.println("Banco = "+banco+"\n"+"Agência = "+agc+"\n"+"Sequencial = "+seq);
        teclado.close();
    }
}
