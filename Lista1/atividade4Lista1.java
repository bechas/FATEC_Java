package atividadesAula;
import java.util.Scanner;
public class atividade4Lista1 {
	Scanner scanner = new Scanner(System.in);
    String senhaBd = "java123";

    System.out.print("Digite a senha: ");  
    String senha = scanner.nextLine();

    while (!senha.equals(senhaBd)){
        System.out.print("Senha errada Digite novamente ");
        senha = scanner.nextLine();
    }
    System.out.print("Senha correta ");

}
}
