package exercício.pkg3;

import java.util.Scanner;

public class Exercício3 
{

    
    public static void main(String[] args) 
    {
        
        int a, b;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa divide dois números inteiros: ");
        System.out.print("Digite o primeiro número: ");
        a = leitura.nextInt();
        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();
        System.out.println("Resultado: " + ((double)a)/b);
        
    }
    
}
