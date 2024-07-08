package modelo;

public class Terreno extends Financiamento {

    protected String tipoZona;

    public Terreno(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnualmente, String tipoZona) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnualmente);
        this.tipoZona = tipoZona;
    }
    public double calcularValorParcelaMensal() {
        return super.calcularValorParcelaMensal() * 1.02;
    }
}
