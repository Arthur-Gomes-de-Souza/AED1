package c14ex02;

public class FigurasGeometricas {
    public static double Quadrado () {
        double lado,area;
        System.out.println("Informe o valor do lado: ");
        lado = Menu2.tec.nextDouble();
        area = lado * lado;
        return area;
    }
    public static double Retangulo () {
        double base,altura,area;
        System.out.println("Informe a base do retangulo: ");
        base = Menu2.tec.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        altura = Menu2.tec.nextDouble();
        area = base * altura;
        return area;
    }
    public static double TrianguloRetangulo () {
        double base,altura,area;
        System.out.println("Informe a base do triangulo retangulo: ");
        base = Menu2.tec.nextDouble();
        System.out.println("Informe a altura do triangulo retangulo: ");
        altura = Menu2.tec.nextDouble();
        area = (base * altura) / 2.0;
        return area;
    }
    public static double Circulo () {
        double raio,area;
        System.out.println("Informe o raio do circulo: ");
        raio = Menu2.tec.nextDouble();
        area = 3.1416 * Math.pow(raio,2);
        return raio;
    }
}
