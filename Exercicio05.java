import java.util.Scanner;

public class Exercicio05 {
    
    public static int inversaoA(int var1, int var2){
        return var1 = var2;
    }
    public static int inversaoB(int var1, int var2){
        return var2 = var1;
    }
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Primeira variável");
        int var1 = leitor.nextInt();
    
        System.out.println("Segunda variável");
        int var2 = leitor.nextInt();
        
        System.out.println("Valor original " + var1);
        System.out.println("Valor original" + var2);

        System.out.println("Inverao 1 para 2: " + inversaoA(var1, var2));
        System.out.println("Inverao 1 para 2: " + inversaoB(var1, var2));

        leitor.close();
        
    }
}
