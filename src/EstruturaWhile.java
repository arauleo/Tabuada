import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "Java54312";
        int numTent = 3;


        while (numTent > 0){

            System.out.println("Senha: ");
            String senhaTent = sc.nextLine();
            if (senhaTent.equals(senhaCorreta)) {
                System.out.println("Senha correta.");
                return;
            } else {
                numTent--;
                System.out.println("Incorreta. Tentativas restantes: " + numTent);

            }

        if (numTent == 0){
            System.out.println("\nConta bloqueada.");}

        }
    }
}
