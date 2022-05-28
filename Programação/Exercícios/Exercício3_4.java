package exercício3;

import java.util.Scanner;

public class Exercício3 
{

    
    public static void main(String[] args) 
    {
      
        int n;
        int fatorial;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número: ");
        n = leitura.nextInt();
        fatorial = 1;
        
        for(int i = 1; i <= n; i = i  + 1){
            fatorial = fatorial * i;
         
        }System.out.println(fatorial);
        
    }
    
}
