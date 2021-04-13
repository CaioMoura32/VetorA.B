package Programa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeroA = new int[4];
        int[] numeroB = new int[4];
        int[] numeroC = new int[4];

        
        for (int i =0; i < 4; i++ ){

            
             
        System.out.println("------------------");     
        System.out.println("Digite um numero!!" + (numeroA[i] + 1));
        System.out.println("------------------");
        numeroA[i] = ler.nextInt();
        ler.nextLine();
        }
        for (int i =0; i <= 4; i++ ){

            System.out.println("------------------");     
            System.out.println("Cadastro 2°Numero.\nDigite um numero!!" + (numeroB[i] +1));
            System.out.println("------------------");
            numeroB[i] = ler.nextInt();
            numeroC[i] = numeroA[i] + numeroB[i];
            System.out.println("A soma dos numeros inteiros é " + numeroC[i]);
            
        }
        ler.close();
    }
    
}
