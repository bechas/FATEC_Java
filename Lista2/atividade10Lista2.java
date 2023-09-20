package atividadesAula;
import java.util.Scanner;
import java.util.Random;
public class atividade10Lista2 {
	Random rand = new Random();
    Scanner scanner = new Scanner (System.in);
    int[] dado1 = new int[100];
    int[] dado2 = new int[100];
    int cont = 0, soma = 0;
    for(int i = 0; i < 100; i++)
    {
        dado1[i] = rand.nextInt(6);
        dado2[i] = rand.nextInt(6);
        soma = dado1[i] + dado2[i];
        if(soma == 7)
        {
            cont++;
        }
    }
    System.out.println("A soma dos dados foi 7 " + cont + " vezes");
}
