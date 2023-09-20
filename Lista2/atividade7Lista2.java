package atividadesAula;

import java.util.Scanner;
import java.util.Random;

public class atividade7Lista2 {
	Random rand = new Random();
    int[] vet = new int[50];
    int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0;
    for(int i = 0; i < 50; i++)
    {
        vet[i] = rand.nextInt(10);
        if(vet[i] == 1)
        {
            cont1++;
        } else if(vet[i] == 2) {
            cont2++;
        } else if(vet[i] == 3) {
            cont3++;
        } else if(vet[i] == 4) {
            cont4++;
        } else if(vet[i] == 5) {
            cont5++;
        } else if(vet[i] == 6) {
            cont6++;
        } else if(vet[i] == 7) {
            cont7++;
        } else if(vet[i] == 8) {
            cont8++;
        } else if(vet[i] == 9) {
            cont9++;
        } else if(vet[i] == 0) {
            cont10++;
        }
    }
    System.out.println(cont1);
    System.out.println(cont2);
    System.out.println(cont3);
    System.out.println(cont4);
    System.out.println(cont5);
    System.out.println(cont6);
    System.out.println(cont7);
    System.out.println(cont8);
    System.out.println(cont9);
    System.out.println(cont10);
}
