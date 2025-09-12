import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "R10p5";

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }
}
