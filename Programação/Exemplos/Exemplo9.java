
package exemplo9;

import java.util.Scanner;

public class Exemplo9 
{

    
    public static void main(String[] args) 
    {
        
        double média;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa lê se você passou");
        System.out.print("Digite a média: ");
        média = leitura.nextDouble();
        
        
        if(média>=6){
            
            System.out.println("Aprovado por nota");
            
        }
        else
        {
            
            System.out.println("Reprovado por nota");
            
        }
            System.out.println("Fim do programa");
        
    }
    
}
