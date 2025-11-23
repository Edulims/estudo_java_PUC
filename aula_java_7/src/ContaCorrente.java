public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo - valor < 0) {
                throw new SaldoInsuficienteException(String.format(
                        "Você está tentando sacar R$ %.2f, mas você tem R$ %.2f na conta",
                        valor, this.saldo));
            }
            this.saldo -= valor;
    }


}