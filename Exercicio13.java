import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = leitor.nextInt();
        leitor.nextLine(); 
        System.out.println("Segundo número: ");
        int num2 = leitor.nextInt();
        leitor.nextLine(); 
        System.out.println("Digite o operador: ");
        String operador = leitor.nextLine();

        switch (operador) {
            case "+":
                int soma = num1 + num2;
                System.out.println("Soma:" + soma);
                break;
            case "-":
                int sub = num1 - num2;
                System.out.println("Subtração:" + sub);
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Não se dividi por 0");
                }
                double div = (double) num1 / num2;
                System.out.println("Divisão:" + div);
                break;
            case "*":
                double multi = num1 * num2;
                System.out.println("Multiplicação:" + multi);
                break;
            default:
                System.out.println("Caracter inválido");
                break;
        }

        leitor.close();
    }
}
