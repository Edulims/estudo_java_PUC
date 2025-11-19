import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123-2", 6700.67, 1000);
        System.out.println("Saldo inicial: " + conta1.getSaldo());
        System.out.println("Limite de credito: " + conta1.getLimiteCred());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe valor para deposito: ");
        double deposito = scanner.nextDouble();
        System.out.print("Informe valor para saque: ");
        double saque = scanner.nextDouble();


        conta1.depositar(deposito);
        conta1.sacar(saque);




    }
}
