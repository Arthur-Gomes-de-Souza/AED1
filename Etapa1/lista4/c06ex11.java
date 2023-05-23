package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex11 {
    public static void main(String[] args) {
        String equipe1, equipe2;
        int sets1, sets2, pontuacao1, pontuacao2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome da primeira equipe: ");
        equipe1 = teclado.nextLine();
        System.out.println("Informe o nome da segunda equipe: ");
        equipe2 = teclado.nextLine();
        System.out.println("Informe quantos sets a primeira equipe ganhou: ");
        sets1 = teclado.nextInt();
        System.out.println("Informe quantos sets a segunda equipe ganhou: ");
        sets2 = teclado.nextInt();
        if (sets1==3 && sets2<=1) {
            pontuacao1 = 3;
            pontuacao2 = 0;
        }
        else {
            if (sets1<=1 && sets2==3) {
                pontuacao1 = 0;
                pontuacao2 = 3;
            }
            else {
                if (sets1==3 && sets2==2) {
                    pontuacao1 = 2;
                    pontuacao2 = 1;
                }
                else {
                    pontuacao1 = 1;
                    pontuacao2 = 2;
                }
            }
        }
        System.out.print("Equipe 1 = "+equipe1+"  Equipe 2 = "+equipe2+
                "\nSets equipe 1 = "+sets1+"    Sets equipe 2 = " +sets2+
                "\nPontos "+equipe1+" = "+pontuacao1+"  Pontos "+equipe2+" = "+pontuacao2);
        teclado.close();
    }
}
