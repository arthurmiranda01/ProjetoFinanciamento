package util;
import java.util.Scanner;
public class interfaceUsuario {

    public double pedirValorImovel() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do seu imóvel?");
        double valorImovel = leitor.nextDouble();
        while (valorImovel < 0) {
            System.out.println("Valor digitado está incorreto. Digite novamente:");
            valorImovel = leitor.nextDouble();
        }
        System.out.println("Valor digitado: R$" + valorImovel);
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o prazo em anos do financiamento?");
        int prazoFinanciamentoEmAnos = leitor.nextInt(); // Alterado para int
        while (prazoFinanciamentoEmAnos > 100 || prazoFinanciamentoEmAnos < 0) {
            System.out.println("Valor digitado está incorreto. Digite novamente:");
            prazoFinanciamentoEmAnos = leitor.nextInt();
        }
        System.out.println("Valor digitado: " + prazoFinanciamentoEmAnos + " anos");
        return prazoFinanciamentoEmAnos; // Alterado para int
    }

    public double pedirTaxaJuros() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a taxa de juros anual?");
        double taxaJuros = leitor.nextDouble();
        while (taxaJuros < 0 || taxaJuros > 100) {
            System.out.println("Valor digitado está incorreto. Digite novamente:");
            taxaJuros = leitor.nextDouble();
        }
        System.out.println("Valor digitado: " + taxaJuros + "%");
        return taxaJuros;
    }
}