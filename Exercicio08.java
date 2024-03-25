import java.util.Scanner;

public class Exercicio08 {
    
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número");
        int num = leitor.nextInt();
        
        if (num >= 50){
            System.out.println("Maior ou igual à 50: ");
        }
        else {
            System.out.println("Menor que 50");
        }
        
        leitor.close();
    }
}
