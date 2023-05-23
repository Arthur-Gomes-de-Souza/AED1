package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex10 {
    public static void main(String[] args) {
        double valorResg, capAplic, rend, impRend, taxaDiaria, taxa;
        int numDias;
        Scanner teclado = new Scanner(System.in);
        // ENTRADA DE DADOS:
        System.out.println("Informe o capital aplicado: ");
        capAplic = teclado.nextDouble();
        System.out.println("Informe o numero de dias que o capital ficou aplicado: ");
        numDias = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe a taxa diaria: ");
        taxa = teclado.nextDouble();
        //CALCULOS:
        taxaDiaria= taxa/100;
        rend = capAplic*numDias*taxaDiaria;
        impRend = rend*0.15;
        valorResg = capAplic+rend-impRend-10;
        //SAIDA:
        System.out.println("Rendimento = "+rend+"\nImposto de Renda = "+impRend+
                "\nValor a ser resgatado = R$"+valorResg);
        teclado.close();

    }
}
