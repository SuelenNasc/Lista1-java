import java.util.Scanner; 

public class Ex17 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in); 

        
        System.out.println("Digite as três notas do aluno:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Peso da Nota 1: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Peso da Nota 2: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Peso da Nota 3: ");
        double peso3 = scanner.nextDouble();

      
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        
        System.out.println("\nMédia ponderada = " + mediaPonderada);

        scanner.close();
    }
}

