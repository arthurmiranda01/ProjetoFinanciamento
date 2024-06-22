package modelo;
import java.util.List;
import java.util.ArrayList;

public class Financiamento {
    // Atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

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
}




