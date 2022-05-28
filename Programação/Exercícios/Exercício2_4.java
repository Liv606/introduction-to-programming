package exercício.pkg2;

import java.util.Scanner;

public class Exercício2 
{

    
    public static void main(String[] args) 
    {
       
        int n;
        int soma;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número: ");
        n = leitura.nextInt();
        soma = 0;
        
        for(int i = 1; i <= n; i = i + 1){
            soma = soma + i;
         
        }System.out.println(soma);
        
    
        
    
    
}
}