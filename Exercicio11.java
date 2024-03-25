import java.util.Scanner;

public class Exercicio11 {
    public static void executar(){

    Scanner leitor = new Scanner(System.in);

    System.out.println("Primeiro número: ");
    int num1 = leitor.nextInt();
    System.out.println("Segundo número: ");
    int num2 = leitor.nextInt();
    System.out.println("Terceiro número: ");
    int num3 = leitor.nextInt();

    if (num1 > num2 && num2 > num3) {
        System.out.println(num3 + ", " + num2 + ", " + num1);
    } else if (num1 > num3 && num3 > num2) {
        System.out.println(num2 + ", " + num3 + ", " + num1);
    } else if (num2 > num1 && num1 > num3) {
        System.out.println(num3 + ", " + num1 + ", " + num2);
    } else if (num2 > num3 && num3 > num1) {
        System.out.println(num1 + ", " + num3 + ", " + num2);
    } else if (num3 > num1 && num1 > num2) {
        System.out.println(num2 + ", " + num1 + ", " + num3);
    } else if (num3 > num2 && num2 > num1) {
        System.out.println(num1 + ", " + num2 + ", " + num3);
    } else {
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }

    leitor.close();
    }

}