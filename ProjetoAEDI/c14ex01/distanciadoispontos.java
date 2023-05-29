package c14ex01;

public class distanciadoispontos {
    public static void metododistanciadoispontos () {
        double x1, y1, x2, y2, distancia;
        System.out.println("Informe a coordenada x do ponto 1: ");
        x1 = Menu1.tec.nextDouble();
        System.out.println("Informe a coordenada y do ponto 1: ");
        y1 = Menu1.tec.nextDouble();
        System.out.println("Informe a coordenada x do ponto 2: ");
        x2 = Menu1.tec.nextDouble();
        System.out.println("Informe a coordenada y do ponto 2: ");
        y2 = Menu1.tec.nextDouble();
        distancia = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        System.out.println("A distancia entre os pontos 1 e 2 = "+distancia);
    }
}
