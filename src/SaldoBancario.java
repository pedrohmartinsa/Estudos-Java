import java.util.Scanner;

public class SaldoBancario {
    public static void main(String[] args) {
//      inicializando o scanner para pegar as entradas do cliente
        Scanner scanner = new Scanner(System.in);

//      inicializando as variáveis da aplicação
        int opcaoCliente = 0;
        double saldo = 400, valorReceber, valorTransferir, montante = 0;

        String menu = """
                1 - Consultar valor
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (opcaoCliente != 4) {
            System.out.printf("\n\n%s", menu);

            System.out.println("\nOpção: ");
            opcaoCliente = scanner.nextInt();

//          mostrando o saldo em conta
            if (opcaoCliente == 1) {
                System.out.printf("Seu saldo: R$%.2f", saldo);
//          somando o valor a receber com o saldo
            } else if (opcaoCliente == 2) {
                System.out.println("Valor a receber: ");
                valorReceber = scanner.nextDouble();

                saldo += valorReceber;

                System.out.printf("Saldo: R$%.2f", saldo);
//          subtraindo o valor a transferir
            } else if (opcaoCliente == 3) {
                System.out.println("Valor a transferir: ");
                valorTransferir = scanner.nextDouble();
//          caso não tanha o valor na conta, dará um erro
                if (saldo >= valorTransferir) {
                    saldo -= valorTransferir;

                    System.out.printf("Saldo: R$%.2f", saldo);
                } else {
                    System.out.println("Saldo insuficiente para ser transferido.");
                    System.out.printf("Saldo disponível: R$%.2f", saldo);
                }
//          mostrar o saldo e sair da aplicação
            } else if (opcaoCliente == 4) {
                System.out.println("Saindo.");
                System.out.printf("Saldo em conta: R$%.2f", saldo);
//          caso o cliente selecione uma opção inválida
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
