public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String motor, int cilindradas) {
        super(marca, motor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    // override: o metodo da classe pai, é modificada pela classe filho
    public String imprimir() {
        // chama o método da classe pai e acrescenta
        return super.imprimir() + " de " + getCilindradas() + " cilindradas.";
    }
}