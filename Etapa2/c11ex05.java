package Etapa2;

import java.util.Scanner;

public class c11ex05 {
    public static void main(String[] args) {
        String nome;
        int codigo,contIngles=0,contAlunos=0;
        double mensalidade,media,somaMensa=0,mensaIngles=0,mensaFrances=0,mensaEspanhol=0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o seu nome: ");
            nome= teclado.nextLine();
            if (nome.equalsIgnoreCase("fim"))
                break;
            System.out.println("Informe o codigo da opcao de lingua: ");
            codigo= teclado.nextInt();
            teclado.nextLine();
            if (codigo==1) {
                mensalidade=100;
                contIngles++;
                mensaIngles +=mensalidade;
            } else if (codigo==2) {
                mensalidade=150;
                mensaFrances += mensalidade;
            }
            else {
                mensalidade=120;
                mensaEspanhol += mensalidade;
            }
            System.out.println("Nome: "+nome);
            System.out.println("Valor da mensalidade: "+mensalidade);
            somaMensa += mensalidade;
            contAlunos++;
        } while (!nome.equalsIgnoreCase("fim"));
        media = somaMensa / contAlunos;
        System.out.println("Quantidade de alunos matriculados nas turmas de ingles = "+contIngles);
        System.out.println("Mensalidade media = "+media);
        System.out.println("Valor total das mensalidades de ingles = "+mensaIngles);
        System.out.println("Valor total das mensalidades de frances = "+mensaFrances);
        System.out.println("Valor total das mensalidades de espanhol = "+mensaEspanhol);
        teclado.close();
    }
}
