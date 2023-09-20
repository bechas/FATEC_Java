package atividadesAula;
import java.util.Scanner;
import java.util.Random;
public class atividade5Lista2 {
	 Random rand = new Random();
     int[] vet = new int[30];
     int cont = 0;
     for(int i = 0; i < 30; i++)
     {
         vet[i] = rand.nextInt(100);
         if(vet[i] % 2 == 1)
         {
             cont++;
         }
     }
     System.out.println(cont);
}
