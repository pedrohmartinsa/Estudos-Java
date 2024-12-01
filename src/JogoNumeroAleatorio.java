import java.util.Random;
import java.util.Scanner;

public class JogoNumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chute = 0;
        int numAleatorio = new Random().nextInt(30);

        for (int i = 0; i <= 5; i++) {
            System.out.println();
            System.out.println("Chute [0 - 30]:");
            chute = scanner.nextInt();

            if (chute == numAleatorio) {
                System.out.println("Você acertou o número secreto!");
                break;
            } else if (chute < numAleatorio) {
                System.out.printf("Número secreto maior que %d", chute);
                continue;
            } else if (chute > numAleatorio) {
                System.out.printf("Número secreto menor que %d", chute);
                continue;
            }
        }
        System.out.println();
        System.out.printf("Fim. Número secreto: %d", numAleatorio);
    }
}
