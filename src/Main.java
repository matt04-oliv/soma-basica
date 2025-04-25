import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Insira o terceiro número");
        int numero3 = scanner.nextInt();

        int calculo = numero1 + numero2 + numero3;

        System.out.println("Soma: " + numero1 + " + " + numero2 + " + " + numero3 + " = " + calculo);

    }
}


//fazer com arrys e for depois