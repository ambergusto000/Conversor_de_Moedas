import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("******************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println();
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");
            System.out.println("******************************************************");
            System.out.print("Escolha uma opção válida: ");

            opcao = entrada.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando o programa. Até logo!");
                break;
            }

            String moedaBase = "";
            String moedaAlvo = "";

            switch (opcao) {
                case 1 -> { moedaBase = "USD"; moedaAlvo = "ARS"; }
                case 2 -> { moedaBase = "ARS"; moedaAlvo = "USD"; }
                case 3 -> { moedaBase = "USD"; moedaAlvo = "BRL"; }
                case 4 -> { moedaBase = "BRL"; moedaAlvo = "USD"; }
                case 5 -> { moedaBase = "USD"; moedaAlvo = "COP"; }
                case 6 -> { moedaBase = "COP"; moedaAlvo = "USD"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            try {
                var requisicao = CriadorDeRequisicao.criar(moedaBase, moedaAlvo);
                String json = RequisicaoService.enviar(requisicao);
                Conversao conversao = ConversorJson.converter(json);

                System.out.println("------------------------------------------------------");
                System.out.print("Digite o valor que deseja converter: ");
                String entradaUsuario = entrada.next(); // lê como string para tratar vírgula

                double valor;
                try {
                    valor = Double.parseDouble(entradaUsuario.replace(",", "."));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Tente novamente.");
                    continue;
                }

                double convertido = valor * conversao.getConversion_rate();

                System.out.printf("Valor %.2f [%s] corresponde ao valor final de >>> %.2f [%s]%n",
                        valor, moedaBase, convertido, moedaAlvo);
                System.out.println("------------------------------------------------------");

            } catch (Exception e) {
                System.out.println("Ocorreu um erro durante a conversão: " + e.getMessage());
            }
        }

        entrada.close();
    }
}
