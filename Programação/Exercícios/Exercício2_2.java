package execício.pkg2;

import java.util.Scanner;

public class Execício2 
{

    
    public static void main(String[] args) 
    {
       
        double a, b, c;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa faz a média de 3 números reais.");
        System.out.print("Digite o primeiro número: ");
        a = leitura.nextDouble();
        System.out.print("Digite o segundo número: ");
        b = leitura.nextDouble();
        System.out.print("Digite o terceiro número: ");
        c = leitura.nextDouble();
        System.out.println("Resultado: " + (a+b+c)/2);
        
    }
    
}
