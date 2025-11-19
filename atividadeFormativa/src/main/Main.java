package main;

import java.util.ArrayList;
import Interface.InterfaceUsuario;
import financiamento.Apartamento;
import financiamento.Casa;
import financiamento.Financiamento;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ Simulador de Imovel ------");

        // cria objeto da interface
        InterfaceUsuario user1 = new InterfaceUsuario();

        // lista de imoveis (vazio)
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        // Loop 2x para preencher a lista vazia com 2 casas
        for (int i = 1; i <= 2; i++) {
            System.out.println("\n---- Dados do Financiamento " + i + " ----");

            // coleta de dados
            double valorImovel = user1.pedirValorImovel();
            int prazoAnos = user1.solicitarPrazoFinanciamento();
            double taxaJuros = user1.taxaJuros();

            // Cria obj financiamento
            Casa casa = new Casa(valorImovel, prazoAnos, taxaJuros);

            // add obj financiamento na lista
            listaFinanciamentos.add(casa);

            // imprime dados
            casa.imprimirInfo();
        }

        // Loop 2x para preencher a lista vazia com 2 apartamento
        for (int i = 1; i <= 2; i++) {
            System.out.println("\n---- Dados do Financiamento " + i + " ----");

            // coleta de dados
            double valorImovel = user1.pedirValorImovel();
            int prazoAnos = user1.solicitarPrazoFinanciamento();
            double taxaJuros = user1.taxaJuros();

            // Cria obj financiamento
            Apartamento apt = new Apartamento(valorImovel, prazoAnos, taxaJuros);

            // add obj financiamento na lista
            listaFinanciamentos.add(apt);

        }

        // Total dos financiamentos

        System.out.println("\n===========================================");
        System.out.println("       Resumo Total dos Financiamentos");
        System.out.println("===========================================");

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        // 6. foreach para percorrer a lista
        for (Financiamento f : listaFinanciamentos) {
            // metodo get e total
            totalImoveis += f.getValorImovel();
            totalFinanciamentos += f.totalPagamento();
        }

        // 7. Imprimimos os totais formatados
        System.out.printf("Total de todos os imóveis: R$ %.2f\n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f\n", totalFinanciamentos);
    }
}