package modelo;

public class Apartamento extends Financiamento {

    protected double numeroVagasGaragem;
    protected int numeroAndarPredio;

    public Apartamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnualmente, int numeroAndarPredio, double numeroVagasGaragem) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnualmente);
        this.numeroAndarPredio = numeroAndarPredio;
        this.numeroVagasGaragem = numeroVagasGaragem;
    }
    @Override
    public double calcularValorParcelaMensal() {
        int numParcelas = prazoFinanciamento * 12; // Total de parcelas
        double taxaMensal = taxaJurosAnual / 100 / 12; // Taxa de juros mensal

        // Fórmula para calcular o valor da parcela mensal (PRICE)
        double valorParcela = valorImovel * taxaMensal /
                (1 - Math.pow(1 + taxaMensal, -numParcelas));

        return valorParcela;
    }
}

