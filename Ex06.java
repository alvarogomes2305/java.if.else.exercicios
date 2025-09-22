import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

      
        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("Peso ideal masculino: " + pesoIdeal + " kg");
        } else if (sexo == 'F') {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Peso ideal feminino: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido! Digite apenas M ou F.");
        }

        sc.close();
    }
}
