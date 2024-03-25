import java.util.Scanner;

public class Ex14 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o valor do primeiro termo (a1): ");
        double a1 = scanner.nextDouble();
        System.out.print("Digite o valor da razão (r): ");
        double r = scanner.nextDouble();
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        
        double an = a1 + (n - 1) * r;

       
        System.out.println("O " + n + "º termo da progressão aritmética é: " + an);

        scanner.close();
    }
}
