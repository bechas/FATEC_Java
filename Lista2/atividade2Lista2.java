package atividadesAula;
import java.util.Scanner;
import java.util.Random;
public class atividade2Lista2 {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner (System.in);
		    Random rand = new Random();
		    int aleatorio = rand.nextInt(100);
		    int num;
		    do{
		        System.out.print("Digite o numero: ");
		        num = scanner.nextInt();
		        if(num > aleatorio)
		        {
		            System.out.println("Palpite alto!");
		        }
		        if(num < aleatorio)
		        {
		            System.out.println("Palpite baixo");
		        }
		    } while(num != aleatorio);

		 

		    System.out.print("Acertou!");
		  }
}
