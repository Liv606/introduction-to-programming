
package exercício.pkg3;

import java.util.Scanner;

public class Exercício3 
{

    
    public static void main(String[] args) 
    {
        
        double peso;
        double taxa;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa calcula a taxa a ser paga");
        System.out.print("Insira o peso do peixe: ");
        peso = leitura.nextDouble();
        
        if(peso>50)
        {
            taxa = (peso-50)*4;
            System.out.println("A taxa a ser paga é: R$:" + taxa );
        }else{
            System.out.println("Peixe isento de taxa.");
        }
        
        
    }
    
}
