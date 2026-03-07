import java.util.Random;
import java.util.Scanner;

public class Jokempo {
    public static void main(String[] args) {

        // Jokempo
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String[] choices = {"pedra", "papel", "tesoura"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("Bem vindo ao Jokempo!");
        System.out.println("Faça sua escolha (pedra, papel, tesoura): ");
        playerChoice = scan.nextLine().toLowerCase();
        if (!playerChoice.equals("pedra") &&
                !playerChoice.equals("papel") &&
                !playerChoice.equals("tesoura")) {
            System.out.println("Você digitou algo errado, por favor reinicie a aplicação.");
        }


        // Declarar variáveis
        // Receber escolha do usuário
        // Receber uma escolha aleatória do computador
        // Checar as win cond e representar o resultado
        // Perguntar se quer jogar novamente
        // Mensagem de até logo




    }

}
