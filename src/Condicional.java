public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme lançado recentemente.");
        } else {
            System.out.println("Filme retrô.");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme incluido no plano.");
        } else {
            System.out.println("Necessário pagar o plus");
        }
    }
}
