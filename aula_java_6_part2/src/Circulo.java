public class Circulo extends Forma implements Imprimivel {
    private static final double PI = 3.14;
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * PI * raio;
    }

    @Override
    public void imprimir() {
        System.out.printf("Circulo - Area: %.2f%n", getArea());
    }
}
