import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite a quantidade de anos de serviço: ");
        int anos = sc.nextInt();

        double bonus;
        if (anos >= 5) {
            bonus = salario * 0.20; // 20%
        } else {
            bonus = salario * 0.10; // 10%
        }

        System.out.println("O valor do bônus é: R$ " + bonus);

        sc.close();
    }
}
