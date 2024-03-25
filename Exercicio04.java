import java.util.Scanner;

public class Exercicio04 {
    
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Primeiro número");
        double num1 = leitor.nextDouble();
    
        System.out.println("Segundo Número");
        double num2 = leitor.nextDouble();
        
        double soma = (num1 + num2);
        System.out.println(soma);

        double subtracao = (num1 - num2);
        System.out.println(subtracao);

        double divisao = (num1 / num2);
        System.out.println(divisao);

        double multiplicacao = (num1 * num2);
        System.out.println(multiplicacao);

        leitor.close();
        }
}
