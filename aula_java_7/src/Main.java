/*
public class Main {

    static int realizarDivisao(int numerador, int denominador) {
        try {
            // código que pode dar exceção
            return numerador / denominador;
        } catch (Exception e) {
            // tratamento da exceção
            return 0;
        } finally { // OPCIONAL!
            // código obrigatoriamente executado independente se deu exception ou não
        }
    }

    static void main(String[] args) {
        System.out.println(realizarDivisao(4, 2));
        System.out.println(realizarDivisao(35, 2));
        System.out.println(realizarDivisao(40, 0));

    }
}

 */

/*
public class Main {

    static int realizarDivisao(int numerador, int denominador) {
        return numerador / denominador;
    }

    static void main(String[] args) {
        try {
            System.out.println(realizarDivisao(4, 2));
            System.out.println(realizarDivisao(35, 2));
            System.out.println(realizarDivisao(40, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage()+ " / " + e.getCause());
            System.out.println("Deu erro em alguma das divisões");
        }
    }
}

 */

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        System.out.println("O saldo atual é de R$" + conta1.getSaldo());

        // vamos scar 800
        try {
            conta1.sacar(800);
            System.out.println("O saldo atual é de R$" + conta1.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // vamos sacar 200
        try {
            conta1.sacar(200);
            System.out.println("O saldo atual é de R$" + conta1.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        // vamos sacar 1000000
        try {
            conta1.sacar(1000000);
            System.out.println("O saldo atual é de R$" + conta1.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());

        }

    }
}

