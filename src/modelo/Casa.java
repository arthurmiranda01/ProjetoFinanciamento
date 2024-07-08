package modelo;

public class Casa extends Financiamento {
    public double areaConstruida;
    protected double areaTerreno;

    public Casa(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnualmente, double areaConstruida, double areaTerreno) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnualmente);
        this.areaConstruida = 1000;
        this.areaTerreno = 1209;
    }

    public double calcularValorParcelaMensal() {
        try {
            double valorParcela = super.calcularValorParcelaMensal() + 80;
            if (valorParcela <= 80) {
                throw new ValorParcelaException("Valor da parcela é menor ou igual a 80.");
            }
            return valorParcela;
        } catch (ValorParcelaException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0; // Valor inválido
        }
    }
}

class ValorParcelaException extends Exception {
    public ValorParcelaException(String message) {
        super(message);
    }
}
