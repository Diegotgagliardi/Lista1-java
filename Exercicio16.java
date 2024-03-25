import java.util.Scanner;

public interface Exercicio16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double num1 = leitor.nextDouble();
        leitor.nextLine();
        System.out.println("Nota 2: ");
        double num2 = leitor.nextDouble();
        leitor.nextLine(); 
        System.out.println("Nota 3: ");
        double num3 = leitor.nextDouble();
        leitor.nextLine();

        double media = (num1 + num2 + num3)/3;

        System.out.println("Resultado: " + media);
        
        leitor.close();
    }
    
}
