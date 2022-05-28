
package exercício7;

import java.util.Scanner;

public class Exercício7 
{

    
    public static void main(String[] args) 
    {
        
        double idade, tempo;
        String sexo;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Aposentadoria");
        System.out.print("Digite o sexo(M ou F): ");
        sexo = leitura.nextLine();
        
        if(sexo.equals("M")){
            System.out.print("Digite a idade: ");
            idade = leitura.nextDouble();
            System.out.print("Digite quantos anos de contribuição: ");
            tempo = leitura.nextDouble();
            
            if(idade>=65 && tempo>=15){
                
                System.out.println("Pessoa apta a aposentar-se por idade");
                
            }else if(tempo>=35){
                
                System.out.println("Pessoa apta a aposentar-se por tempo de contribuição");
                
            }else{
                
                System.out.println("Pessoa não apta a aposentar-se");
                
            }
        }
        
        if(sexo.equals("F")){
            System.out.print("Digite a idade: ");
            idade = leitura.nextDouble();
            System.out.print("Digite quantos anos de contribuição: ");
            tempo = leitura.nextDouble();
            
            if(idade>=60 && tempo>=15){
                
                System.out.println("Pessoa apta a aposentar-se por idade");
                
            }else if(tempo>=30){
                
                System.out.println("Pessoa apta a aposentar-se por tempo de contribuição");
                
            }else{
                
                System.out.println("Pessoa não apta a aposentar-se");
                
            }
        }
        
    }
    
}
