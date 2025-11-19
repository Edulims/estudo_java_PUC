public class ContaCorrente extends ContaBancaria {
    private double limiteCred;


    public ContaCorrente(String numeroConta, double saldo, double limiteCred) {
        super(numeroConta, saldo);
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public void sacar(double valor) {
        if (valor > saldo +limiteCred) {
            System.out.println("Saldo insuficiente para saque, seu saldo é: " + getSaldo());
        } else {
            this.saldo -= valor;
            System.out.println("Valor sacado foi de: " + valor);
            System.out.println("Saldo total: " + getSaldo());
        }
    }



}