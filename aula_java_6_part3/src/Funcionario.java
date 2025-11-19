abstract class Funcionario {
    protected double salarioBase;

    public double getSalario() {
        return this.salarioBase + getGratificacao();
    }

    abstract protected double getGratificacao();


}
