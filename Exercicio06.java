import java.util.Scanner;

public class Exercicio06 {
    
    public static double conversorF(double c){
        return (9 * c + 160) / 5;
    }
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor em Celsius: ");
        double c = leitor.nextDouble();

        System.out.println("A temperatura em Fahrenheit é: " + conversorF(c));

        leitor.close();
        
    }
}
