import java.util.Scanner;

public class Exercicio19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Raio : ");
        double raio = leitor.nextDouble();
        System.out.println("Altura: ");
        double altura = leitor.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume é: " + volume);

        leitor.close();
    }
}
