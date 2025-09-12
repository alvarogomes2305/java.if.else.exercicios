import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();

        double desconto = 0;
        double salarioLiquido = salario;

        if (salario <= 600) {
            System.out.println("Isento de desconto do INSS.");
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        if (desconto > 0) {
            salarioLiquido = salario - desconto;
            System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);
            System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
        }

        sc.close();
    }
}
