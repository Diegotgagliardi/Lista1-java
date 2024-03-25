import java.util.Scanner;

public class Exercicio17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double num1 = leitor.nextDouble();
        System.out.println("Nota 2: ");
        double num2 = leitor.nextDouble();
        System.out.println("Nota 3: ");
        double num3 = leitor.nextDouble();
    
        double nota1 = num1 * 0.3;
        double nota2 = num2 * 0.4;
        double nota3 = num3 * 0.3;

        double resultado = nota1 + nota2 + nota3;

        System.out.println("A média ponderada é" + resultado);
        
        leitor.close();
    }
}