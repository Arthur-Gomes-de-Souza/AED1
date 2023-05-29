package c14ex01;

public class areavolumeesfera {
    public static void metodoareavolumeesfera () {
        double area, volume, raio;
        System.out.println("Informe o raio: ");
        raio = Menu1.tec.nextDouble();
        area = 4*3.1416*Math.pow(raio,2);
        volume = 4/3.0*3.1416*Math.pow(raio,3);
        System.out.println("A area da superficie esferica = "+ area);
        System.out.println("O volume da esfera = "+ volume);
    }
}
