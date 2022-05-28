package exercício.pkg7;

import java.util.Scanner;

public class Exercício7 
{

   
    public static void main(String[] args) 
    {
        
       int n, r, x, controle ;
       Scanner leitura = new Scanner(System.in);
       System.out.print("Digite um número: ");
       n = leitura.nextInt();
       x = 2;
       controle = 0;
       
       if(n == 1 || n == 0){
           
           System.out.println("Não é primo!");
           
       }else{
       while (x<n)  
       {
            r = n%x;
            if (r==0)
                {
                    controle = 1;
                }       
            x = x + 1;
       }
       
       if (controle==1)
       {
           System.out.println("Não é primo!");
       }
       else
       {
           System.out.println("É primo!");
       }
       }
       

        
    }
    
}
