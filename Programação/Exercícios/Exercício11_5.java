package exercício11_5;

import java.util.Scanner;

public class Exercício11_5 
{

    
    public static void main(String[] args) 
    {
        
        Scanner leitura = new Scanner(System.in);
        int n, max, min, total;
        int media = 0;
        System.out.print("Digite o tamanho do vetor: ");
        n = leitura.nextInt();
        int a[] = new int[n];
        System.out.print("Digite o valor máximo: ");
        max = leitura.nextInt();
        System.out.print("Digite o valor mínimo: ");
        min = leitura.nextInt();
        
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*(max - min + 1)) + min;
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
        for(int i = 0; i<a.length; i++){
            media = media + a[i];
        }
        total = media/a.length;
        
        
        System.out.println("A média do vetor é: " + total);
        
    }
    
}
