
package exercício5;

import java.util.Scanner;

public class Exercício5 
{

    
    public static void main(String[] args) 
    {
        
        int a, b;
        System.out.println("Esse programa calcula a diferença de doir números, o maior pelo menor.");
        System.out.print("Digite o primeiro número: ");
        Scanner leitura = new Scanner(System.in);
        a = leitura.nextInt();
        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();
        
        if(a<b){
            
            System.out.println("O resultado é: " + (b-a));
            
        }else{
            System.out.println("O resultado é: " + (a-b));
        }
        
    }
    
}
