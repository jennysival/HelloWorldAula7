import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        System.out.println("Este é o primeiro exercício da Aula 07");
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = leitor.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = leitor.nextInt();

        System.out.println("Olá, "+nome+"! Você tem "+idade+" anos.");
    }
}
