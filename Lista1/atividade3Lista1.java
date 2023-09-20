package atividadesAula;
import java.util.Iterator;
import java.util.Scanner;

public class atividade3Lista1 {
	Scanner scanner = new Scanner(System.in);
	String [] nome = new String [5];
	for (int i=0;i<nome.length;i++) {
		
		System.out.print("Digite o " + (i+1) + " nome: ");
		String nomeEntrada = scanner.nextLine();
		nome[i] = nomeEntrada;	
	}
	
	System.out.print("Digite o último nome: ");
	String ultimoNome = scanner.nextLine();
	
	for (int i=0;i<nome.length;i++) {
		
		if (nome[i].contains(ultimoNome)){
			System.out.println("Nome já está na lista");
			break;
		}
		else {
			System.out.println("Nome não está na lista");
		}
	}
}
