package exercício7_5;

import java.util.Scanner;

public class Exercício7_5 
{

    
    public static void main(String[] args) 
    {
        
        int n;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = leitura.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i<a.length; i++){
            a[i] = 5 + 2*i;
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
}
