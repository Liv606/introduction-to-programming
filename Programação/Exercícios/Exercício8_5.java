package exercício8_5;

import java.util.Scanner;

public class Exercício8_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[8];
        int inv[] = new int[8];
        int j = 7;
        Scanner leitura = new Scanner(System.in);
        
        for(int i = 0; i<a.length; i++){
            System.out.print("Digite o número do índice " + i + ": ");
            a[i] = leitura.nextInt();
        }
        
        
        
        for(int i = 0; i<a.length; i++){
            
            inv[i] = a[j];
            j = j - 1;
            
        }
        
        for(int i = 0; i<a.length; i++){
         
            System.out.println(inv[i]);
            
        }
    }
    
}
