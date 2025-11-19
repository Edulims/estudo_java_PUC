public class ContaBancaria {
    protected double saldo;
    private String numeroConta;


    public ContaBancaria(String numeroConta, double saldo) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado de: " + valor);
            System.out.println("Saldo total: " + getSaldo());
        } else {
            System.out.println("Valor invalido para depósito");
        }
    }

    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("Saldo insuficiente para saque, seu saldo é: " + getSaldo());
        } else {
            this.saldo -= valor;
        }
    }


}
