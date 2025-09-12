import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Verificação com if e else
        if (numero > 20) {
            double metade = numero / 2.0; 
            System.out.println("O número é maior que 20.");
            System.out.println("A metade dele é: " + metade);
        } else {
            System.out.println("O número não é maior que 20.");
        }

        sc.close();
    }
}
