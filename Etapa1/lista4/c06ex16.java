package AED1.Etapa1.lista4;
import java.util.Scanner;
//FUNÇÃO: CALCULA O RESULTADO FINAL DO ALUNO ATRAVÉS DA MÉDIA ARITMÉTICA
public class c06ex16 {
    public static void main(String[] args) {
        String resultado;
        int faltas, idade, peso1, peso2;
        double nota1, nota2, nota3, trabalho, media, notaFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as faltas: ");
        faltas = teclado.nextInt();
        System.out.println("Informe a nota da primeira prova: ");
        nota1= teclado.nextDouble();
        System.out.println("Informe a nota da segunda prova: ");
        nota2= teclado.nextDouble();
        System.out.println("Informe a nota da terceira prova: ");
        nota3= teclado.nextDouble();
        System.out.println("Informe a nota do trabalho final: ");
        trabalho = teclado.nextDouble();
        System.out.println("Informe a sua idade: ");
        idade = teclado.nextInt();
        //CALCULOS:
        if (nota1>nota3 && nota2>nota3) {
            media = (nota1+nota2)/2;
        }
        else {
            if (nota1>nota2 && nota3>nota2){
                media = (nota1+nota3)/2;
            }
            else {
                media = (nota2+nota3)/2;
            }
        }
        //FINAL DO CALCULO DA MEDIA
        if (faltas<=5){
            peso1= 3;
        }
        else {
            if (faltas<=10){
                peso1= 2;
            }
            else {
                peso1= 1;
            }
        }
        //FINAL DO CALCULO DO PESO1
        if (idade<=17){
            peso2= 1;
        }
        else {
            if (idade<=50){
                peso2= 2;
            }
            else {
                peso2= 3;
            }
        }
        //FINAL DO CALCULO DO PESO2
        notaFinal = media*peso1+trabalho*peso2;
        if (notaFinal<=50){
            resultado = "Reprovado";
        }
        else {
            if (notaFinal<=70){
                resultado= "Regular";
            }
            else {
                if (notaFinal<=80){
                    resultado= "Bom";
                }
                else {
                    if (notaFinal<=90){
                        resultado= "Muito Bom";
                    }
                    else {
                        resultado = "Excelente";
                    }
                }
            }
        }
        System.out.println("Resultado = "+resultado);
        teclado.close();
    }
}
