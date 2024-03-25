import java.util.Scanner;

public class Exercicio15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ponto 1 x: ");
        double p1x = leitor.nextDouble();
        System.out.println("Ponto 1 y: ");
        double p1y = leitor.nextDouble();
        System.out.println("Ponto 2 x: ");
        double p2x = leitor.nextDouble();
        System.out.println("Ponto 2 y: ");
        double p2y = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow((p2x - p1x), 2) + Math.pow((p2y - p1y), 2));

        System.out.println("A distância é: " + distancia);
        leitor.close();
    }
}