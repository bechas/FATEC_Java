package atividadesAula;
import java.util.Scanner;
public class atividade5Lista1 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtMaterias;
        double mediaMaterias;
        System.out.print("Quantas materias o aluno possui? ");
        qtMaterias = ler.nextInt();
        System.out.print("Qual a media para aprovacao? ");
        mediaMaterias = ler.nextDouble();
        String[] nomeMaterias = new String[qtMaterias];
        double[] p1 = new double[qtMaterias];
        double[] p2 = new double[qtMaterias];
        double[] tr = new double[qtMaterias];
        double[] media = new double[qtMaterias];
        String[] aprovadoMateria = new String[qtMaterias];
        for(int i = 0; i < qtMaterias; i++)
        {
            System.out.print("O nome da materia: ");
            nomeMaterias[i] = ler.next();
            System.out.print("Digite a nota da p1: ");
            p1[i] = ler.nextDouble();
            System.out.print("Digite a nota da p2: ");
            p2[i] = ler.nextDouble();
            System.out.print("Digite a nota do trabalho: ");
            tr[i] = ler.nextDouble();
        }
        for(int i = 0; i < qtMaterias; i++)
        {
            media[i] = (p1[i] + p2[i] + tr[i]) / 3;
            if(media[i] < mediaMaterias)
            {
                aprovadoMateria[i] = "Reprovado";
            } else {
                aprovadoMateria[i] = "Aprovado";
            }
        }
        for(int i = 0; i < qtMaterias; i++)
        {
            System.out.println(nomeMaterias[i] + ": " + p1[i] + " | " + p2[i] + " | " + tr[i] + " | " + media[i] + " | " + aprovadoMateria[i] + " |");
        }
    }
}
