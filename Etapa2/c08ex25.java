package Etapa2;

public class c08ex25 {
    public static void main(String[] args) {
        String simbolo = "*";
        for (int aux2=1; aux2<=10; aux2++) {
            for (int aux=1; aux<=aux2; aux++)
                System.out.print(simbolo+" ");
            System.out.println();
        }
        for (int aux2=10; aux2>=1; aux2--) {
            for (int aux=1; aux<=aux2; aux++)
                System.out.print(simbolo+" ");
            System.out.println();
        }
    }
}
