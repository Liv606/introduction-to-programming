package exemplo23;

import java.util.Scanner;

public class Exemplo23 
{

    
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        Scanner leitura = new Scanner(System.in);
        System.out.print("Entre com o valor a ser buscado: ");
        int v = leitura.nextInt();
        
        for(int i = 0; i < a.length; i++){
            if(v == a[i]){
                System.out.println("Achei " + v + " no índice " + i);
            }
        }
        
    }
    
}
