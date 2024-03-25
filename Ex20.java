import java.util.Scanner; 

public class Ex20 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o tempo de viagem em horas: ");
        double tempoViagem = scanner.nextDouble();
        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

     
        double distancia = tempoViagem * velocidadeMedia;

        
        double litrosCombustivel = distancia / 12;

        
        System.out.printf("A quantidade de litros de combustível gasta é: %.2f\n", litrosCombustivel);

        scanner.close(); 
    }
}

