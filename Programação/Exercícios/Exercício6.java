package exercício.pkg6;

import java.util.Scanner;

public class Exercício6 
{

    
    public static void main(String[] args) 
    {
     
        System.out.println("Este programa o volume de uma esfera!");
        double v, pi, raio;
        pi = 3.14;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        raio = leitura.nextDouble();
        v = (4*pi*raio*raio*raio)/3;
        System.out.println("O volume da esfera é: " + v);
        
        
    }
    
}
