package atividadesAula;
import java.util.Scanner;
import java.util.Random;
public class atividade1Lista2 {
	public static void main(String[] args) {

		 

		 

		  Scanner scanner = new Scanner (System.in);
		    Random rand = new Random();
		    int[] aleatorios = new int[10];
		    for(int i = 0; i < 10; i++)
		    {
		        aleatorios[i] = rand.nextInt(100);
		    }
		    for(int i = 0; i < 10; i++)
		    {
		        if((aleatorios[i] % 2) == 1)
		        {
		            System.out.println(aleatorios[i]);
		        }
		    }
		  }
}
