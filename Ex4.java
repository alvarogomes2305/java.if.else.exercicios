import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número (ponto flutuante): ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número (ponto flutuante): ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("Ordem decrescente: " + n1 + ", " + n2);
        } else {
            System.out.println("Ordem decrescente: " + n2 + ", " + n1);
        }

        sc.close();
    }
}
