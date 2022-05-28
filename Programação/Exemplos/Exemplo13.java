package exemplo13;

import java.util.Scanner;

public class Exemplo13 
{

    
    public static void main(String[] args) 
    {
       
        double x, y, r;
        String T;
        
        do{
            System.out.println("Multiplicador de números: ");
            Scanner leitura = new Scanner(System.in);
            System.out.print("Digite X: ");
            x = leitura.nextDouble();
            System.out.print("Digite Y: ");
            y = leitura.nextDouble();
            r = x*y;
            System.out.println("O resultado de X*Y é: " + r);
            System.out.println("Deseja continuar?(S/N): "); 
            T = leitura.nextLine();
        }while(T.equals("S"));
        
        
    }
    
}

