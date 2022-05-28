package exercício6_5;

import java.util.Scanner;

public class Exercício6_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[50];
        int n;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = leitura.nextInt();
        
        for(int i = 0; i<a.length; i++){
            a[i] = n + n*i;
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
}
