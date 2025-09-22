import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = sc.nextDouble();

        double limite = salarioBruto * 0.30;

        if (prestacao <= limite) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        sc.close();
    }
}
