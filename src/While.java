import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua nota para Top Gun ou -1 para sair: ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }
        System.out.printf("Média da nota de Top Gun: %.2f", media / totalDeNotas);
    }
}
