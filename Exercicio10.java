import java.util.Scanner;

public class Exercicio10 {
    
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 5: ");
        int num = leitor.nextInt();

        if(num == 1) {
            System.out.println("Um");
        }

        else if(num == 2) {
            System.out.println("Dois");
        }
        else if(num == 3) {
                System.out.println("Três");
        }
        else if(num == 4) {
            System.out.println("Quatro");
        }
        else if(num == 5) {
            System.out.println("Cinco");
        }
        else {
            System.out.println("Número inválido");
        }
        
        leitor.close(); 
    }
}
