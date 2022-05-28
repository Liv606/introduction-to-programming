
package exercício.pkg4;

import java.util.Scanner;

public class Exercício4 
{

    
    public static void main(String[] args) 
    {
      
        int valor;
        System.out.println("Esse programa mostra o módulo de um número interiro");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número: ");
        valor = leitura.nextInt();
        
        if(valor>0){
            System.out.println("O médulo é: " + valor);
        }else{
            System.out.println("O módulo é: " + valor*-1);
        }
        
    }
    
}
