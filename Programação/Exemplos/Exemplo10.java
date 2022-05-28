
package exemplo10;

import java.util.Scanner;

public class Exemplo10 
{

    
    public static void main(String[] args) 
    {
        
        double s;
        System.out.println("Esse programa calcula o reajuste do seu salário.");
        System.out.print("Digite seu salário: ");
        Scanner leitura = new Scanner(System.in);
        s = leitura.nextDouble();
        
        if(s<500){
            
            System.out.println("O seu novo salário é: " + s*1.15);
            
        }else if(s>=500 && s<=1000){
            
            System.out.println("O seu novo salário é: " + s*1.1);
            
        }else{
            System.out.println("O seu novo salário é: " + s*1.05);
        }
        
    }
    
}
