
package exercício.pkg5;

import java.util.Scanner;

public class Exercício5 
{

    
    public static void main(String[] args) 
    {
        
        System.out.println("Esse programa calcula o comprimento de uma circunferência!");
        double c, pi, raio;
        pi = 3.14;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        raio = leitura.nextDouble();
        c = 2*pi*raio;
        System.out.println("O comprimento é: " + c);
        
        
        
    }
    
}
