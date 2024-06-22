package main;
import modelo.Financiamento;
import util.interfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList para armazenar os financiamentos
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        // Adicione quatro financiamentos à lista
        for (int i = 0; i < 4; i++) {
            interfaceUsuario interfaceUsuario = new interfaceUsuario();
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJuros = interfaceUsuario.pedirTaxaJuros();

            // Instancie um novo objeto Financiamento
            Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);

            // Adicione o financiamento à lista
            listaFinanciamentos.add(novoFinanciamento);

            // Informe os valores do financiamento adicionado
            System.out.println("Financiamento " + (i + 1) + ":");
            System.out.println("Valor do imóvel: R$" + valorImovel);
            System.out.println("Prazo em anos: " + prazoFinanciamentoEmAnos + " anos");
            System.out.println("Taxa de juros: " + taxaJuros + "%\n");
            System.out.println("Valor total do financiamento: R$" +
                    novoFinanciamento.calcularValorTotalFinanciamento() + "\n");
        }

        // Calcular o valor total dos imóveis
        double valorTotalImoveis = listaFinanciamentos.stream()
                .mapToDouble(Financiamento::getValorImovel)
                .sum();
        System.out.println("Valor total dos imóveis: R$" + valorTotalImoveis);

        // Calcular o valor total dos financiamentos
        double valorTotalFinanciamentos = listaFinanciamentos.stream()
                .mapToDouble(Financiamento::calcularValorTotalFinanciamento)
                .sum();
        System.out.println("Valor total dos financiamentos: R$" + valorTotalFinanciamentos);
    }
}
