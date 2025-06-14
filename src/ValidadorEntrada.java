import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorEntrada {

    public static Scanner sc = new Scanner(System.in);

    public static double lerDoublePositivo(String mensagem) {
        double valor = 0;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = sc.nextDouble();
                if (valor < 0) {
                    System.out.println("O valor deve ser maior que zero.");
                } else {
                    return valor;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine();
            }
        }
    }

    public static int lerIntPositivo(String mensagem) {
        int valor = 0;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = sc.nextInt();
                if(valor <= 0) {
                    System.out.println("O valor deve ser maior que zero.");
                } else {
                    return valor;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    public static int lerOpcao(String mensage) {
        while(true) {
            try {
                System.out.print(mensage);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite uma opção válida.");
                sc.nextLine();
            }
        }
    }

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public static void fecharScanner() {
        sc.close();
    }

}