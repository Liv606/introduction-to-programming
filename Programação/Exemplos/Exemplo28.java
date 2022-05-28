package exemplo28;

import java.util.Scanner;

public class Exemplo28 
{

    
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        int v, i;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número a ser apagado: ");
        v = leitura.nextInt();
        

        for(i = 0; i<a.length; i++){
            
            if(v == a[i]){
                
                for(i = i + 1; i<a.length; i++)
                {
                    a[i - 1] = a[i];
                }
                a[a.length - 1] = 0;
                i = a.length;
            }
            
        }
        
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]);
        }
        }
        
    }
    

