package lista4;
import java.util.Scanner;
public class c06ex17 {
    public static void main(String[] args) {
        String cursoTec, cursoSup, anosExpe, pessoaCriativa, lideranca, trabalhoSozinho, autodidata, renumeracao, trabalharBh;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você tem curso tecnico de programacao? ");
        cursoTec= teclado.nextLine();
        System.out.println("Você tem curso superior de programação? ");
        cursoSup= teclado.nextLine();
        System.out.println("Você tem menos de 3 anos de experiência em programação? ");
        anosExpe= teclado.nextLine();
        System.out.println("Você se considera uma pessoa criativa? ");
        pessoaCriativa= teclado.nextLine();
        System.out.println("Você prefere liderar a ser liderado? ");
        lideranca= teclado.nextLine();
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        trabalhoSozinho= teclado.nextLine();
        System.out.println("Você é autodidata (aprende sozinho)? ");
        autodidata= teclado.nextLine();
        System.out.println("Você aceitaria uma remuneração inicial de R$1500? ");
        renumeracao= teclado.nextLine();
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        trabalharBh= teclado.nextLine();
        if (cursoTec.equalsIgnoreCase("v") && cursoSup.equalsIgnoreCase("f") && anosExpe.equalsIgnoreCase("v")){
            System.out.println("Voce nao esta apto a trabalhar na empresa.");
        }
        else if (pessoaCriativa.equalsIgnoreCase("f")|| trabalhoSozinho.equalsIgnoreCase("v")|| autodidata.equalsIgnoreCase("f")|| trabalharBh.equalsIgnoreCase("v")) {
            System.out.println("Voce nao esta apto a trabalhar na empresa.");
        }
        else if (lideranca.equalsIgnoreCase("v") && renumeracao.equalsIgnoreCase("v")) {
            System.out.println("Voce nao esta apto a trabalhar na empresa.");
        }
        else {
            System.out.println("Voce esta apto a trabalhar na empresa.");
        }
        teclado.close();
    }
}
