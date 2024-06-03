class Financiamento {
    //Atríbutos
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    //Construtor
    Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnualmente){
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnualmente;
    }

    //Métodos
    double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    double calcularPagamentoTotal(){

    }
}

class InterfaceUsuario {

}

public class Main {
    public static void main(String[] args){

    }
}
