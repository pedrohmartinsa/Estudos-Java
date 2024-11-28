public class SwitchCase {
    public static void main(String[] args) {
        int dia = 8;
        String diaDaSemana;

        switch (dia) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda Feira";
                break;
            case 3:
                diaDaSemana = "Terça Feira";
                break;
            case 4:
                diaDaSemana = "Quarta Feira";
                break;
            case 5:
                diaDaSemana = "Quinta Feira";
                break;
            case 6:
                diaDaSemana = "Sexta Feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "dia inválido";
                break;
        }
        System.out.printf("O número %d corresponde á %s%n", dia, diaDaSemana);
    }
}
