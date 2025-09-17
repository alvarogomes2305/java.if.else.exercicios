import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else {
            int diferenca = Math.abs(n1 - n2); // diferença absoluta
            System.out.println("A diferença entre o maior e o menor é: " + diferenca);
        }

        sc.close();
    }
}
