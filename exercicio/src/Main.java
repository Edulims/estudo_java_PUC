//Exercicio
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite suas 3 notas: \n");

        System.out.println("Primeira Nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Segunda Nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Terceira Nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média foi: %.2f",media);

        scanner.close();
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int valor1 = scanner.nextInt();

        if (valor1 > 0) {
            System.out.printf("O valor %d é Positivo", valor1);
        }
        else if (valor1 < 0){
            System.out.printf("O valor de %d é Negativo", valor1);
        }
        else {
            System.out.printf("O valor %d é zero", valor1);
        }

        scanner.close();
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int numeroInicial = 3;
        int multiplo = 0;

        do{
            int resultado = numeroInicial * multiplo;
            System.out.printf("%d X %d = %d\n", numeroInicial,multiplo,resultado);
            multiplo++;
        } while (numeroInicial * multiplo <= 30); //A condição precisa ser TRUE
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int valor1 = scanner.nextInt();
        System.out.printf("\nTABUADA %d:\n", valor1);

        for (int i = 0; i <= 10; i++) {
            int resultado = valor1 * i;
            System.out.printf("%d X %d = %d\n", valor1, i, resultado);
        }
        scanner.close();
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano, para verificar se ele é bissexto: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.printf("%d é um ano Bissexto.\n", ano);
        }
        else {
            System.out.printf("%d não é um ano Bissexto.\n", ano);
        }
        scanner.close();
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número, para verificar se ele é primo: ");
        int numero = scanner.nextInt();

        // 1. Criamos nossa "bandeira" e assumimos que o número é primo.
        boolean ehPrimo = true;

        // 2. Tratamos os casos especiais primeiro.
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            // 3. O laço vai procurar por um divisor.
            // Otimização: só precisamos testar até a raiz quadrada do número.
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                // 4. Se encontrarmos UM divisor, já sabemos que não é primo.
                if (numero % i == 0) {
                    ehPrimo = false; // Levantamos a bandeira de "não é primo".
                    break;           // Saímos do laço, pois o trabalho acabou.
                }
            }
        }

        // 5. DEPOIS do laço, tomamos a decisão final baseada na bandeira.
        if (ehPrimo) {
            System.out.printf("%d é um número primo.\n", numero);
        } else {
            System.out.printf("%d não é um número primo.\n", numero);
        }

        scanner.close();
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Graus Celsius (C): ");
        float temperaturaC = scanner.nextFloat();

        float temperaturaF = (temperaturaC * 1.8f) + 32f;

        System.out.printf("\nTemperatura em C: %.1f", temperaturaC);
        System.out.printf("\nTemperatura em F: %.1f", temperaturaF);

        if (temperaturaF < 32) {
            System.out.printf("\n%.1f F - Frio", temperaturaF);
        } else if (temperaturaF >= 32 && temperaturaF <= 80 ) {
            System.out.printf("\n%.1f F - Moderado", temperaturaF);
        }else {
            System.out.printf("\n%.1f F - Quente", temperaturaF);
        }

        scanner.close();
    }
}
 */

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero1 = scanner.nextInt();

        for (int linha = 1; linha <= numero1 ; linha++) {
            for (int asterisco = 1; asterisco <= linha ; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dezenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenasRomanas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] milharesRomanas = {"", "M", "MM", "MMM"};

        System.out.print("Digite um número inteiro entre 1 e 4000: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 4000) {
            System.out.println("Número inválido. Por favor, tente novamente.");
        } else {
            String unidades = unidadesRomanas[numero % 10];
            String dezenas = dezenasRomanas[(numero / 10) % 10];
            String centenas = centenasRomanas[(numero / 100) % 10];
            String milhares = milharesRomanas[(numero / 1000) % 10];

            String numeroRomano = milhares + centenas + dezenas + unidades;
            System.out.println("Número romano equivalente: " + numeroRomano);
        }

        scanner.close();
    }
}
 */




