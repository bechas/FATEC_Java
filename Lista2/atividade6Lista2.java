package atividadesAula;

import java.util.Scanner;
import java.util.Random;

public class atividade6Lista2 {
	Scanner scanner = new Scanner (System.in);
    Random rand = new Random();
    int aleatorio[] = new int[15];
    int maior = 0;

 

    for(int i = 0; i < 15; i++)
    {
        aleatorio[i] = rand.nextInt(100);
        if(aleatorio[i]>=maior){
            maior=aleatorio[i];
        }
    }
    int menor = aleatorio[0];
    for(int i = 0; i < 15; i++)
    {
       if(aleatorio[i]<=menor){
            menor=aleatorio[i];
       }
}}}
