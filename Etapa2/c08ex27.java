package AED1.Etapa2;
public class c08ex27 {
    public static void main(String[] args) {
        double conta;
       for (int aux=1; aux<=10;aux++) {
           for (int aux2=0; aux2<=8;aux2++) {
               conta = Math.pow(2,aux2);
               for (int aux3 = 1;aux3<= conta; aux3++) {
                   System.out.print("* ");
               }
               System.out.println();
           }
           for (int aux4=7;aux4>=0;aux4--) {
               conta = Math.pow(2,aux4);
               for (int aux3= 1; aux3<=conta;aux3++){
                   System.out.print("* ");
               }
               System.out.println();
           }
       }
    }
}
