import java.util.Scanner;

public class Exercicio20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Tempo da viagem em horas : ");
        double tempo = leitor.nextDouble();
        System.out.println("Velocidade média: ");
        double media = leitor.nextDouble();
    
        int litro = 12;

        double distancia = tempo * media;
        double combustivel = distancia/litro;
        System.out.println("Combustível gasto é de: " + combustivel + " litros");
        leitor.close();
    }    
}
