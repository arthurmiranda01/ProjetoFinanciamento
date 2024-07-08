package main;
import modelo.Financiamento;
import modelo.Casa;
import modelo.Terreno;
import modelo.Apartamento;
import util.interfaceUsuario;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // ArrayList para armazenar os financiamentos
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        //Pedindo as informações pro usuário
        for (int i = 0; i < 1; i++) {
            interfaceUsuario interfaceUsuario = new interfaceUsuario();
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJuros = interfaceUsuario.pedirTaxaJuros();

            // Casa
            double areaConstruida = 150.0;
            double areaTerreno = 300.0;
            //Apartamento
            int numeroAndarPredio = 2;
            double numeroVagasGaragem = 15;
            //Terreno
            String tipoZona = "Rural";

            // Instancie um novo objeto Financiamento
            Financiamento novoCasa = new Casa(valorImovel, prazoFinanciamentoEmAnos, taxaJuros, areaConstruida, areaTerreno);
            Financiamento novoCasaDois = new Casa(valorImovel, prazoFinanciamentoEmAnos, taxaJuros,areaConstruida, areaTerreno);
            Financiamento novoApartamento = new Apartamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros, numeroAndarPredio, numeroVagasGaragem);
            Financiamento novoApartamentoDois = new Apartamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros, numeroAndarPredio, numeroVagasGaragem);
            Financiamento novoTerreno = new Terreno(valorImovel, prazoFinanciamentoEmAnos, taxaJuros, tipoZona);

            // Adicione o financiamento à lista
            listaFinanciamentos.add(novoCasa);
            listaFinanciamentos.add(novoCasaDois);
            listaFinanciamentos.add(novoApartamento);
            listaFinanciamentos.add(novoApartamentoDois);
            listaFinanciamentos.add(novoTerreno);

            //Salvando os dados em ArrayList
            try (FileOutputStream fos = new FileOutputStream("dados_financiamentos.ser");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(listaFinanciamentos);
                System.out.println("Lista de financiamentos serializada e salva.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar o arquivo de serialização.");
                e.printStackTrace();
            }

            // Informe os valores do financiamento adicionado
            System.out.println("Financiamento " + (i + 1) + ":");
            System.out.println("Valor do imóvel: R$" + valorImovel);
            System.out.println("Prazo em anos: " + prazoFinanciamentoEmAnos + " anos");
            System.out.println("Taxa de juros: " + taxaJuros + "%\n");

            //Casa
            System.out.println("Valor total do financiamento (Casa): R$" +
                    novoCasa.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
            System.out.println("Valor da parcela mensal (Casa): R$" +
                    novoCasa.calcularValorParcelaMensal());
            System.out.println("Área construída da casa é de: " + areaConstruida);
            System.out.println("Área de terreno da casa é de: " + areaTerreno + "\n");
            //SalvandoCasa01
            try {
                FileWriter arquivo = new FileWriter("dados_financiamento-casa1.txt");
                PrintWriter gravador = new PrintWriter(arquivo);

                gravador.println("Valor do imóvel: R$" + valorImovel);
                gravador.println("Valor do financiamento: R$" + novoCasa.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
                gravador.println("Taxa de juros: " + (taxaJuros * 100) + "% ao ano");
                gravador.println("Prazo de financiamento: " + prazoFinanciamentoEmAnos + " anos");
                gravador.println("Área construída da casa: " + areaConstruida + " m²");
                gravador.println("Área de terreno da casa: " + areaTerreno + " m²");

                gravador.close();
                System.out.println("Dados salvos no arquivo dados_financiamento-casa1.txt.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar os dados no arquivo.");
                e.printStackTrace();
            }

            // (implemente a leitura aqui)

            //CasaDois
            System.out.println("Valor total do financiamento (Segunda Casa): R$" +
                    novoCasa.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
            System.out.println("Valor da parcela mensal (Segunda Casa): R$" +
                    novoCasa.calcularValorParcelaMensal());
            System.out.println("Área construída da casa é de: " + areaConstruida);
            System.out.println("Área de terreno da casa é de: " + areaTerreno + "\n");
            //SalvandoCasa02
            try {
                FileWriter arquivo = new FileWriter("dados_financiamento-casa2.txt");
                PrintWriter gravador = new PrintWriter(arquivo);

                gravador.println("Valor do imóvel: R$" + valorImovel);
                gravador.println("Valor do financiamento: R$" + novoCasa.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
                gravador.println("Taxa de juros: " + (taxaJuros * 100) + "% ao ano");
                gravador.println("Prazo de financiamento: " + prazoFinanciamentoEmAnos + " anos");
                gravador.println("Área construída da casa: " + areaConstruida + " m²");
                gravador.println("Área de terreno da casa: " + areaTerreno + " m²");

                gravador.close();
                System.out.println("Dados salvos no arquivo dados_financiamento-casa2.txt.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar os dados no arquivo.");
                e.printStackTrace();
            }

            //Apartamento
            System.out.println("Valor total do financiamento (Apartamento): R$" +
                    novoApartamento.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
            System.out.println("Valor da parcela mensal (Apartamento): R$" +
                    novoApartamento.calcularValorParcelaMensal());
            System.out.println("Área construída da casa é de: " + areaConstruida);
            System.out.println("O andar do apartamento é: " + numeroAndarPredio);
            System.out.println("O número de vagas da garagem é: " + numeroVagasGaragem + "\n");
            //SalvandoAP01
            try {
                FileWriter arquivo = new FileWriter("dados_financiamento_apartamento01.txt");
                PrintWriter gravador = new PrintWriter(arquivo);

                gravador.println("Valor do imóvel: R$" + valorImovel);
                gravador.println("Valor do financiamento: R$" + novoApartamento.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
                gravador.println("Taxa de juros: " + (taxaJuros * 100) + "% ao ano");
                gravador.println("Prazo de financiamento: " + prazoFinanciamentoEmAnos + " anos");
                gravador.println("Área construída do apartamento: " + areaConstruida + " m²");
                gravador.println("Andar do apartamento: " + numeroAndarPredio);
                gravador.println("Número de vagas na garagem: " + numeroVagasGaragem);

                gravador.close();
                System.out.println("Dados salvos no arquivo dados_financiamento_apartamento01.txt.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar os dados no arquivo.");
                e.printStackTrace();
            }

            //ApartamentoDois
            System.out.println("Valor total do financiamento (Segundo Apartamento): R$" +
                    novoApartamento.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
            System.out.println("Valor da parcela mensal (Segundo Apartamento): R$" +
                    novoApartamento.calcularValorParcelaMensal());
            System.out.println("O andar do apartamento é: " + numeroAndarPredio);
            System.out.println("O número de vagas da garagem é: " + numeroVagasGaragem + "\n");
            //SalvandoAP02
            try {
                FileWriter arquivo = new FileWriter("dados_financiamento_apartamento02.txt");
                PrintWriter gravador = new PrintWriter(arquivo);

                gravador.println("Valor do imóvel: R$" + valorImovel);
                gravador.println("Valor do financiamento: R$" + novoApartamento.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
                gravador.println("Taxa de juros: " + (taxaJuros * 100) + "% ao ano");
                gravador.println("Prazo de financiamento: " + prazoFinanciamentoEmAnos + " anos");
                gravador.println("Área construída do apartamento: " + areaConstruida + " m²");
                gravador.println("Andar do apartamento: " + numeroAndarPredio);
                gravador.println("Número de vagas na garagem: " + numeroVagasGaragem);

                gravador.close();
                System.out.println("Dados salvos no arquivo dados_financiamento_apartamento02.txt.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar os dados no arquivo.");
                e.printStackTrace();
            }

            //Terreno
            System.out.println("Valor total do financiamento (Terreno): R$" +
                    novoTerreno.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
            System.out.println("Valor da parcela mensal (Terreno): R$" +
                    novoTerreno.calcularValorParcelaMensal());
            System.out.println("Seu terreno é localizado em uma zona: " + tipoZona + "\n");
            //SalvandoTerreno
            try {
                FileWriter arquivo = new FileWriter("dados_financiamento_terreno.txt");
                PrintWriter gravador = new PrintWriter(arquivo);

                gravador.println("Valor do terreno: R$" + valorImovel);
                gravador.println("Valor do financiamento: R$" + novoTerreno.calcularValorParcelaMensal() * (prazoFinanciamentoEmAnos * 12));
                gravador.println("Taxa de juros: " + (taxaJuros * 100) + "% ao ano");
                gravador.println("Prazo de financiamento: " + prazoFinanciamentoEmAnos + " anos");
                gravador.println("Zona do terreno: " + tipoZona);

                gravador.close();
                System.out.println("Dados salvos no arquivo dados_financiamento_terreno.txt.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar os dados no arquivo.");
                e.printStackTrace();
            }
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
