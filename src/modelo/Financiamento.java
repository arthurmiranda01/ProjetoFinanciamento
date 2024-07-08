package modelo;
import java.util.List;
import java.util.ArrayList;

public  abstract class Financiamento {
    // Atributos
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnualmente) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnualmente;
    }

    // Métodos para obter os valores
    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    // Método para calcular o valor total do financiamento
    public double calcularValorTotalFinanciamento() {
        // Calcula os juros totais
        double jurosTotais = this.valorImovel * (this.taxaJurosAnual / 100) * this.prazoFinanciamento;

        // Calcula o valor final do financiamento
        double valorTotalFinanciamento = this.valorImovel + jurosTotais;
        return valorTotalFinanciamento;
    }

    public double calcularValorParcelaMensal() {
        int numParcelas = prazoFinanciamento * 12; // Total de parcelas
        double taxaMensal = taxaJurosAnual / 100 / 12; // Taxa de juros mensal

        // Fórmula para calcular o valor da parcela mensal
        double valorParcela = valorImovel * taxaMensal / (1 - Math.pow(1 + taxaMensal, -numParcelas));
        return valorParcela;
    }
}





