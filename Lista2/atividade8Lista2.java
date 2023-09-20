package atividadesAula;
import java.util.Scanner;
public class atividade8Lista2 {
	Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10]; 
    int[] frequencia = new int[10]; 


    for (int i = 0; i < 10; i++) {
        System.out.print("Digite o " + (i + 1) + "º número: ");
        numeros[i] = scanner.nextInt();
    }


    for (int i = 0; i < 10; i++) {
        int contador = 0;
        for (int j = 0; j < 10; j++) {
            if (numeros[i] == numeros[j]) {
                contador++;
            }
        }
        frequencia[i] = contador;
    }

    int valorMaisFrequente = numeros[0];
    int frequenciaMaxima = frequencia[0];

    for (int i = 1; i < 10; i++) {
        if (frequencia[i] > frequenciaMaxima) {
            valorMaisFrequente = numeros[i];
            frequenciaMaxima = frequencia[i];
        }
    }

    System.out.println("O valor mais frequente é: " + valorMaisFrequente);
    System.out.println("Sua frequência é: " + frequenciaMaxima);
}
