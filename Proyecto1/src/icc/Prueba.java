package icc;
import java.util.Random;
import java.util.Scanner;

public class Prueba {
private static final Random random = new Random();

public static void main(final String[] args) {

    System.out.println("¡Bienvenido al Simulador para el Lanzamiento de Dados!");
    System.out.println("¿De cuantos lanzamientos consiste tu simulacion?");
    int entrada = 0;
    try (Scanner scanner = new Scanner(System.in)) {
        entrada = scanner.nextInt();
    }
    final int[] simulacionDados = new int[11];
    for (int x = 0; x < entrada; x++) {
        simulacionDados[amount() - 2]++;
    }
    System.out.println(String.format("RESULTADOS DE LA SIMULACION"));
    for (int i = 0; i < 11; i++) {
        System.out.println(String.format("%s salio un total de %s veces ", i + 2, simulacionDados[i]));
    }
    
    // Para imprirmir el histograma
    for(int i = 0; i < 11; i++){
        System.out.print(i + ": ");
        for(int j = 0; j < simulacionDados[i]; j++){
            System.out.print("*");
        }
    }
}

    public static int amount() {
        return random.nextInt(6) + random.nextInt(6) + 2;

    }
}
