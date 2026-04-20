import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Bem vindo ao programa de tabuadas!!");
        System.out.print("Deseja ver a tabuada de qual número? ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("\nTabuada do " + numero + ":\n");
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
        }


        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine();
                System.out.print("Digite uma palavra ou frase: ");
                String frase = sc.nextLine();
                System.out.println("Você digitou: " + frase);
            }
            else if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            }
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 2);

        sc.close();
    }
}