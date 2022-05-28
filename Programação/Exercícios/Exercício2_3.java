
package exercício2;

import java.util.Scanner;

public class Exercício2 
{

    
    public static void main(String[] args) 
    {
       
        int idade;
        int idiomas;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qualificação de secretárias");
        System.out.print("Insira a idade: ");
        idade = leitura.nextInt();
        System.out.print("Insira a quantidade de idiomas: ");
        idiomas = leitura.nextInt();
        if(idade>=19 && idiomas>=2){
            
            System.out.println("A candidata atende aos requisitos!");
            
        }else{
            System.out.println("A candidata não atende os requisitos!");
        }
        
        
    }
    
}
