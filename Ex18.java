import java.util.Scanner;

public class Ex18 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in); 

        
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        System.out.printf("A média harmônica das notas é: %.2f\n", mediaHarmonica);

        scanner.close();
    }
}

