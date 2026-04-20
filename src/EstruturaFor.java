import java.util.Scanner;

public class EstruturaFor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você quer sacar?\nLimite até R$1.000,00.\n");
        int ValorSaque = sc.nextInt();

        if (ValorSaque < 2 || ValorSaque > 1000) {
            System.out.println("Valor inválido.");
            return;
        }
        int nota = 100;

        for (int i = 0; i < 6; i++) {

            int quantCed = ValorSaque / nota;

            if (quantCed > 0) {
                System.out.println("\n" + quantCed + " nota(s) de R$" + nota + ".");
                ValorSaque = ValorSaque % nota;
            }
            if (nota == 100) {
                nota = 50;
            } else if (nota == 50) {
                nota = 20;
            } else if (nota == 20) {
                nota = 10;
            } else if (nota == 10) {
                nota = 5;
            } else if (nota == 5) {
                nota = 2;
            }
        }
    }
}