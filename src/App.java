import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, insira seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá, "+nome+"! Muito prazer em conhecer você!");

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Você tem "+idade+" anos.");
    }
}
