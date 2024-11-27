import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        boolean incluidoNoPlano = true;

        double media = (9.8 + 6.3 + 8.0) / 3;

        String sinopse = """
                Filme: Top Gun: Maverick
                Filmo com galá dos anos 80
                Muito bom!
                Ano de lançamento: %d
                Incluido no plano ? %b
                Media de nota: %.2f
                """.formatted(anoDeLancamento, incluidoNoPlano ,media);
        System.out.println(sinopse);

        double dado = 5.5;
        int dado2 = (int) dado;
        System.out.println(dado2);
    }

}
