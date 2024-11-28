import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 3;
        double media = 0;
        double nota = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Qual sua nota para Top Gun ?");
            nota = scanner.nextDouble();
            media += nota;
        }

        System.out.printf("A média para Top Gun foi: %.2f", media/num);
    }
}
