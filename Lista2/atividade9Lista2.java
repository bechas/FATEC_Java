package atividadesAula;
import java.util.Scanner;
import java.util.Random;
public class atividade9Lista2 {
	Random rand = new Random();
    Scanner scanner = new Scanner (System.in);
    int[] vet = new int[25];
    int ver, ver1 = 0;
    for(int i = 0; i < 25; i++)
    {
        vet[i] = rand.nextInt(20);
    }
    System.out.print("Digite o numero para verificacao: ");
    ver = scanner.nextInt();
    for(int i = 0; i < 25; i++)
    {
        if(vet[i] == ver)
        {
            ver1 = 1;
        }
    }
    if(ver1 == 1)
    {
        System.out.println("O numero digitado foi encontrado");
    } else {
        System.out.println("O numero digitado nao foi encontrado");
    }
}
