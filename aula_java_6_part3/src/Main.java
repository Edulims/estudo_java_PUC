import java.util.*;

public class Main {
    public static void imprimir(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("\nSalário base: %.2f  \nSalário com gratificação: %.2f\n",
                    funcionario.salarioBase, funcionario.getSalario());
        }
    }

    public static void main(String[] args) {
        var listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(new Concursado(4000, 5));
        listaFuncionarios.add(new Temporario(2000, 12));
        listaFuncionarios.add(new Concursado(2400, 34));
        listaFuncionarios.add(new Temporario(1200, 10));
        /*
        Funcionario joao = new Concursado(4000, 5);
        Funcionario jose = new Temporario(2000, 12);
        Funcionario maria = new Concursado(2400, 34);
        Funcionario pedro = new Temporario(1200, 10);

        listaFuncionarios.add(joao);
        listaFuncionarios.add(jose);
        listaFuncionarios.add(maria);
        listaFuncionarios.add(pedro);
         */

        imprimir(listaFuncionarios);





    }

}
