package atividadesAula;
import java.util.Scanner;
public class atividade1Lista1 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        if(idade <= 17) {
            System.out.println("Menor de idade");
        } else if(idade >= 60) {
            System.out.println("Idosa");
        } else {
            System.out.println("Adulta");
        }
    }
}
