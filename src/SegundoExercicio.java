import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        System.out.println("Este é o segundo exercício da Aula 07");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu endereço completo: ");
        String endereço = leitor.nextLine();
        
        System.out.println("O pacote para o seu produto será enviado para: "+endereço+".");
    }
    

}
