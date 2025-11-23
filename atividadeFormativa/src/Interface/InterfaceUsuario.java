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

    public double tamConstruida() {
        double areaConstruida;
        do {
            System.out.println("Informe o tamanho da área construida: ");
            areaConstruida = scanner.nextDouble();
            scanner.nextLine();

            if (areaConstruida <= 0) {
                System.out.println("Erro: A arena construida precisa ser um valor positivo.");
            }
        } while (areaConstruida <= 0);
        return areaConstruida;
    }

    public double tamTerreno() {
        double areaTerreno;
        do {
            System.out.println("Informe o tamanho do terreno: ");
            areaTerreno = scanner.nextDouble();
            scanner.nextLine();

            if (areaTerreno <= 0) {
                System.out.println("Erro: O tamanho do terreno precisa ser um valor positivo.");
            }
        } while (areaTerreno <= 0);
        return areaTerreno;
    }

    public int quantidadeVagaGaragem() {
        int vagaGaragem;
        do {
            System.out.println("Informe a quantidade de vagas na garagem: ");
            vagaGaragem = scanner.nextInt();
            scanner.nextLine();

            if (vagaGaragem < 0) {
                System.out.println("Erro: A quantidade de vagas precisa ser 0 ou maior.");
            }
        } while (vagaGaragem < 0);
        return vagaGaragem;
    }

    public int numeroAndar() {
        int andar;
        do {
            System.out.println("Informe o andar do apartamento: ");
            andar = scanner.nextInt();
            scanner.nextLine();

            if (andar <= 0) {
                System.out.println("Erro: O andar do apartamento precisa ser um valor positivo.");
            }
        } while (andar <= 0);
        return andar;
    }


}