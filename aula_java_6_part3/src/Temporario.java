public class Temporario extends Funcionario {
    private int mesesContrato;

    Temporario(double salarioBase, int mesesContrato) {
        this.salarioBase = salarioBase;
        this.mesesContrato = mesesContrato;
    }

    protected double getGratificacao() {
        return this.mesesContrato + 100;
    }



}
