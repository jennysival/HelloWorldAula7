import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        System.out.println("Este é o terceiro exercício da Aula 07");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu saldo: ");
        double saldo = leitor.nextDouble();

        System.out.println("O saldo atual da sua conta é de: R$"+saldo+".");
    }
}
