package atividadesAula;
import java.util.Scanner;
public class atividade2Lista1 {
	Scanner numero = new Scanner(System.in);
	System.out.print("Digite um número inteiro: ");
	int n = numero.nextInt();
	int soma =0;
	int impar=1;		
	for (int i=0;i<n;i++) 
	{
		soma+= impar;
		impar+=2;
	}
		System.out.println("A soma dos ímpares inteiros próximos ao número digitado é: "+soma);
	}
}
