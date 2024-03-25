import java.util.Scanner;

public class Ex03 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro (A): "); 
        int numeroA = scanner.nextInt(); 

        System.out.print("Digite o segundo número inteiro (B): ");
        int numeroB = scanner.nextInt(); 

        if (numeroA == numeroB) {
            System.out.println("A sequência de números informados é inválida."); 
        } else if (numeroA > numeroB) { 
            System.out.println("O maior número é: " + numeroA); 
        } else {
            System.out.println("O maior número é: " + numeroB);
        }

        scanner.close(); 
    }
}
