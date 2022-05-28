package exemplo27;

import java.util.Scanner;

public class Exemplo27 
{

    
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        int v, i;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número a ser removido: ");
        v = leitura.nextInt();
        
        for(i = 0; i<a.length; i++){
            if(v == a[i]){
                a[i] = 0;
            }
        }
        
        for(i = 0; i<a.length; i++){
            
            System.out.print(a[i]);
            
        }
        
    }
    
}
