package c14ex01;

public class jogo {
    public static void metodojogo () {
        double numAleatorio;
        int numero, cont=0;
        numAleatorio =(int) Math.floor(Math.random() * 100);
        do {
            System.out.println("Tente acertar o numero gerado pelo computador: ");
            numero = Menu1.tec.nextInt();
            if (numero < numAleatorio) {
                System.out.println("O NUMERO DIGITADO ESTA ABAIXO DO NUMERO GERADO.");
                cont++;
            } else if (numero > numAleatorio) {
                System.out.println("O NUMERO DIGITADO ESTA ACIMA DO NUMERO GERADO.");
                cont++;
            } else {
                System.out.println("VOCE ACERTOU O NUMERO!");
                cont++;
            }
        } while (numero != numAleatorio);
        System.out.println("Tentativas = "+ cont);
    }
}
