package exercício18_5;

import java.util.Scanner;

public class Exercício18_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int [8];
        double n;
        double soma = 0;
        
        Scanner leitura = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o vetor de posição " +i+ "(somente 0 e 1):");
            a[i]  = leitura.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            soma = soma + (a[i] * (Math.pow(2, 7 - i)));
        }
            System.out.print("O binário é: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        System.out.println("O decimal é: " + soma);
        
    }
    
}
