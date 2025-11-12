package Interface;

import java.util.Scanner;
import java.util.Locale;

public class InterfaceUsuario {

    private final Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }

    public double pedirValorImovel() {
        double valorImovel;
        do {
            System.out.print("Informe o Valor do imovel: ");
            valorImovel = scanner.nextDouble();
            scanner.nextLine(); // Consome o "\n" deixado pelo nextDouble()

            if (valorImovel <= 0) {
                System.out.println("Erro: O valor do imóvel deve ser positivo. Tente novamente.");
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }

    public int solicitarPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Informe a quantidade de anos do financiamento: ");
            prazo = scanner.nextInt();
            scanner.nextLine(); // Consome o "\n" deixado pelo nextInt()

            if (prazo <= 0) {
                System.out.println("Erro: O prazo deve ser um número positivo de anos. Tente novamente.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double taxaJuros() {
        double taxa;
        do {
            System.out.print("Informe a taxa de juros anual (%): ");
            taxa = scanner.nextDouble();
            scanner.nextLine();

            if (taxa <= 0) {
                System.out.println("Erro: A taxa de juros deve ser um valor positivo. Tente novamente.");
            }
        } while (taxa <= 0);
        return taxa;
    }
}