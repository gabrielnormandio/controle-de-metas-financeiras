
import java.util.Locale;
import java.util.Scanner;

public class AppFinanceiro {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("=== Sistema de Metas Financeiras ===");

        String nome = ValidadorEntrada.lerTexto("Digite o nome da meta: ");
        double valor = ValidadorEntrada.lerDoublePositivo("Digite o valor da meta (R$): ");
        int dias = ValidadorEntrada.lerIntPositivo("Em quantos dias deseja alcançar essa meta? ");


        MetaFinanceira meta = new MetaFinanceira(nome, valor, dias);

        while (true) {
            System.out.println("\n1 - Registrar ganho");
            System.out.println("2 - Ver resumo da meta");
            System.out.println("0 - Sair");

            int opcao = ValidadorEntrada.lerOpcao("Opção: ");

            if (opcao == 1) {
                double ganho = ValidadorEntrada.lerDoublePositivo("Informe o valor recebido: ");
                meta.registrarGanho(ganho);
            } else if (opcao == 2) {
                meta.exibirResumo();
            } else if (opcao == 0) {
                System.out.println("Saindo... Obrigado por usar o sistema!");
                ValidadorEntrada.fecharScanner();
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

    }
}