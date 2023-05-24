package AED1.Etapa3;

import java.util.Scanner;

public class c13ex06 {
    public static void main(String[] args) {
        String nome,familia,ultimoSobrenome;
        int cont=0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o nome de uma familia: ");
        familia = tec.nextLine();
        for (int aux=1;aux<=100;aux++) {
            System.out.println("Informe seu nome completo: ");
            nome = tec.nextLine();
            String[] nomeInteiro = nome.split(" ");
            ultimoSobrenome = nomeInteiro[nomeInteiro.length-1];
            if (ultimoSobrenome.equalsIgnoreCase(familia))
                cont++;
        }
        System.out.println("Pessoas da familia "+familia+" = "+cont);
        tec.close();
    }
}
