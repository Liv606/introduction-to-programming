package exemplo.pkg14;

import java.util.Scanner;

public class Exemplo14 
{

    
    public static void main(String[] args) 
    {
        
        double x, y, r;
        String T;
        
        do{
            Scanner leitura = new Scanner(System.in);
            System.out.print("Digite X: ");
            x = leitura.nextDouble();
            System.out.print("Digite Y: ");
            y = leitura.nextDouble();
            r = x*y;
            System.out.println("O resultado de X*Y é: " + r);
            System.out.print("Deseja continuar?(S/N): "); 
            T = leitura.next();
        }while(T.equals("S"));
        
    }
    
}
