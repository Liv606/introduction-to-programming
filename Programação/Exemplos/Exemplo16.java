package exemplo16;

import java.util.Scanner;

public class Exemplo16 
{

    
    public static void main(String[] args) 
    {
        
        int r, x;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número em base decimal: ");
        x = leitura.nextInt();
        System.out.println("Leitura de binário é de baixo para cima");
        do{
            r = x%2;
            System.out.println(r);
            x = x/2;
        }while(x>=2);
        System.out.println(x);
        
    }
    
}
