import java.util.Scanner;

public class Exercicio18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double num1 = leitor.nextDouble();
        System.out.println("Nota 2: ");
        double num2 = leitor.nextDouble();
        System.out.println("Nota 3: ");
        double num3 = leitor.nextDouble();

        double fase1 = 3 / ((1/num1) + (1/num2) + (1/num3));

        System.out.println("Media harmônica: " + fase1);        

        leitor.close();
    }
}
