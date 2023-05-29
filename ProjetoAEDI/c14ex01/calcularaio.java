package c14ex01;

public class calcularaio {
    public static void metodocalcularaio () {
        double areaCirc, raio;
        int angulo;
        System.out.println("Informe o valor da area do setor circular: ");
        areaCirc = Menu1.tec.nextDouble();
        System.out.println("Informe o valor do angulo: ");
        angulo = Menu1.tec.nextInt();
        raio = Math.sqrt(areaCirc * 360/((float)angulo * 3.1416));
        System.out.println("Raio = "+ raio);
    }
}
