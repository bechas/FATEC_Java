package atividadesAula;
import java.util.Scanner;
import java.util.Random;
public class atividade3Lista2 {
Scanner scanner = new Scanner (System.in);
    Random rand = new Random();
    int aleatorio[] = new int[20];
    int soma = 0;

 

    for(int i = 0; i < 20; i++)
    {
        aleatorio[i] = rand.nextInt(100);
        soma += aleatorio[i];
    }
    int media = soma /20; 
    System.out.println(media);

}
