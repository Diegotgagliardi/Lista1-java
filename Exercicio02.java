import java.util.Scanner;

public class Exercicio02 {
    
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Primeiro número");
        double num1 = leitor.nextDouble();
    
        System.out.println("Segundo Número");
        double num2 = leitor.nextDouble();
        
        double resultado = (num1 + num2);
        System.out.println(resultado);
        
        leitor.close();
        }
     }
