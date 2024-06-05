import java.util.Scanner;

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

        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}

class interfaceUsuario {

    double pedirValorImovel(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do seu imóvel?");
        double valorImovel = leitor.nextDouble();
        System.out.println("Valor digitado: R$" + valorImovel);
        return 0;
    }

    int pedirPrazoFinanciamento(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o prazo em anos do financiamento?");
        double prazoFinanciamento = leitor.nextDouble();
        System.out.println("Valor digitado: " + prazoFinanciamento + "anos");
        return 0;
    }

    double pedirTaxaJuros(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a taxa de juros anual?");
        double taxaJuros = leitor.nextDouble();
        System.out.println("Valor digitado: " + taxaJuros + "%");
        return 0;
    }
}

public class Main {
    public static void main(String[] args){
        interfaceUsuario interfaceUsuario = new interfaceUsuario();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();
        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);
    }
}
