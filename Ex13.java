import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado = 0;
        boolean valido = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 > 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Impossível dividir!!");
                    valido = false;
                }
                break;
            default:
                System.out.println("Sinal Inválido");
                valido = false;
        }

        if (valido) {
            System.out.printf("Resultado: %.2f%n", resultado);
        }

        sc.close();
    }
}
