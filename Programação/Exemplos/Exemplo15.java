package exemplo15;

import java.util.Scanner;

public class Exemplo15 
{

    
    public static void main(String[] args) 
    {
        
        double x;
        System.out.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        x = leitura.nextDouble();
        do{
            x = x/2;
            System.out.println(x);
        }while(x>=1);
        System.out.println("Fim do programa");
        
    }
    
}
