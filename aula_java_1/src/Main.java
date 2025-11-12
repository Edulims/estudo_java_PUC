
// Exemplo em Java
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}

 */

/*
public class Main {

    public static void main(String[] args) {

        // Exemplos de declaração e atribuição de variável

        int numero;

        float altura = 1.70f;

        Strin nome;



        // Exemplos de declaração e atribuição de constante

        final float PI = 3.1416F;

        final String NOME_PAGINA = "home";

    }

}

 */

/*
public class Main {
    public static void main(String[] args) {
        // declaração das variáveis
        int x, y;
        int X;     //X maiúsculo é diferente de x minúsculo.
        boolean p, q;
        float a = 10.5f;

        //Aqui atribuímos valores às variáveis que criamos anteriormente.
        //Perceba que todas as linhas terminam com ponto e vírgula.
        x = 10;
        y = x - 38;
        X = 9 % 2;
        p = (3 >= 5);
        q = (true || false);

        //Aqui mostramos uma sequência de mensagens na tela.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("X = " + X);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.printf("a = %.2f", a*3);
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        // Variáveis com diferentes tipos de dados
        String nome = "Rafaela";
        int idade = 32;
        double altura = 1.65;

        // Exemplo 1: Uso do System.out.println para exibir dados
        System.out.println("Exemplo 1:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome + ", Altura: " + altura);

        // Exemplo 2: Uso do System.out.print para exibir dados
        System.out.print("\nExemplo 2:\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("Idade: " + idade + "\n");
        System.out.print("Altura: " + altura + "\n");
        System.out.print("Nome: " + nome + ", Altura: " + altura + "\n");

        // Exemplo 3: Uso do System.out.printf para formatar e exibir dados
        System.out.println("\nExemplo 3:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Nome: %s, Altura: %.2f\n", nome, altura);
        System.out.println();

        // Exemplo 4: Uso do System.out.format para formatar e exibir dados
        System.out.println("\nExemplo 4:");
        System.out.format("Nome: %s\n", nome);
        System.out.format("Idade: %d\n", idade);
        System.out.format("Altura: %.2f\n", altura);
        System.out.format("Nome: %s, Altura: %.2f\n", nome, altura);
        System.out.println();

        // Exemplo 5: Uso do StringBuilder para construir a mensagem
        System.out.println("\nExemplo 5:");
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Nome: ").append(nome).append("\n");
        mensagem.append("Idade: ").append(idade).append("\n");
        mensagem.append("Altura: ").append(altura).append("\n");
        mensagem.append("Nome: ").append(nome).append(", Altura: ").append(altura).append("\n");
        System.out.println(mensagem);
    }
}
 */

/*
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        scanner.close();
    }
}
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é um(a) idoso(a).");
        }
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        int numero = 3;

        if (numero == 1) {
            System.out.println("O número é igual a 1");
        } else if (numero == 2) {
            System.out.println("O número é igual a 2");
        } else if (numero == 3) {
            System.out.println("O número é igual a 3");
        } else {
            System.out.println("O número é diferente de 1, 2 e 3");
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int numero = 3;

        switch (numero) {
            case 1:
                System.out.println("O número é igual a 1");
                break;
            case 2:
                System.out.println("O número é igual a 2");
                break;
            case 3:
                System.out.println("O número é igual a 3");
                break;
            default:
                System.out.println("O número é diferente de 1, 2 e 3");
                break;
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int numero = 0;

        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 5);
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + i);
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do break
        System.out.println("Exemplo com break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Encerra o loop quando i == 3
            }
            System.out.println("Número: " + i);
        }

        System.out.println();

        // Exemplo de uso do continue
        System.out.println("Exemplo com continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula para a próxima iteração quando i == 3
            }
            System.out.println("Número: " + i);
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Exemplo com o loop for:");
        // Perceba como é o jeito de escrever o "for" em Java
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }

        System.out.println("\n\nExemplo com o loop foreach:");
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        String[] estudantes = new String[] {"Maria", "Pedro", "João"};

        System.out.println("Exemplo com o loop for:");
        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Estudante: " + estudantes[i]);
        }

        System.out.println("\n\nExemplo com o loop foreach:");
        for (String estudante : estudantes) {
            System.out.println("Estudante: " + estudante);
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Exemplo com o loop for:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento: " + matriz[i][j]);
            }
        }

        System.out.println("\n\nExemplo com o loop foreach:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.println("Elemento: " + elemento);
            }
        }
    }
}
 */

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

