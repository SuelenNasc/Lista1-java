import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: "); 
        double A = scanner.nextDouble(); 

        System.out.print("Digite o valor de B: "); 
        double B = scanner.nextDouble();

        if (A == B) {
            System.out.println("Os números são iguais."); 
        } else { 
            System.out.println("Os números são diferentes.");

            
            if (A > B) {
                System.out.println("O valor de A (" + A + ") é maior que o valor de B (" + B + ").");
            } else {
                System.out.println("O valor de B (" + B + ") é maior que o valor de A (" + A + ").");
            }
        }

        scanner.close();
    }
}

