package lista5;
import java.util.Scanner;
public class c07ex04 {
    public static void main(String[] args) {
        String equipe, estado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome da equipe de futebol: ");
        equipe= teclado.nextLine();
        switch (equipe){
            default ->
                estado = "Minas Gerais";
            case "Botafogo","Flamengo","Fluminense","Vasco" ->
                estado= "Rio de Janeiro";
            case "Corinthians","Palmeiras","Santos","São Paulo" ->
                estado= "São Paulo";
            case "Grêmio","Internacional","Juventude" ->
                estado= "Rio Grande do Sul";
            case "Náutico","Santa Cruz","Sport" ->
                estado= "Pernambuco";
        }
        System.out.println("Essa equipe é de "+estado);
    }
}
