public class Apartamento extends Acomodacao {

    @Override
    public double precoPorNoite() {
        return super.precoPorNoite() * 1.2;
    }
}
