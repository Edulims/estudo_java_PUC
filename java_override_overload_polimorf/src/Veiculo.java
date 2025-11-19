public class Veiculo {
    protected String marca;
    protected String motor;

    public Veiculo(String marca, String motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public void getDetalhes() {
        System.out.println("A marca do veículo é: " + getMarca() +
                ", e o motor é " + getMotor());
    }

    public void getSom() {
        System.out.println("Os veículos podem ser bem barulhentos ou bem silenciosos.");
    }

}


