import java.util.Scanner;

public class Ex11 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores inteiros distintos:");

      
        System.out.print("Valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = scanner.nextInt();
        System.out.print("Valor 3: ");
        int valor3 = scanner.nextInt();


        int menor, meio, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}
