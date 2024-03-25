import java.util.Scanner;
import java.lang.Math;

public class Ex15 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("\nDigite as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

   
        System.out.printf("\nA distância entre os pontos P1(%.2f, %.2f) e P2(%.2f, %.2f) é: %.2f\n", x1, y1, x2, y2, distancia);

        scanner.close();
    }
}

