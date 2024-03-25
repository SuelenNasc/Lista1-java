import java.util.Scanner;

public class Ex16 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in); 

     
        System.out.println("Digite as três notas do aluno:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

  
        double media = (nota1 + nota2 + nota3) / 3;

      
        System.out.printf("\nA média aritmética das notas é: %.2f\n", media);

        scanner.close();
    }
}

