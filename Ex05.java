import java.util.Scanner;

public class Ex05 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Valor original de A: " + A);
        System.out.println("Valor original de B: " + B);

        int temp = A; 
        A = B; 
        B = temp; 

        System.out.println("Valores trocados - A: " + A + ", B: " + B);

        scanner.close();
    }
}
