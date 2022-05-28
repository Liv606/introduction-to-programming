package exercício10;

import java.util.Scanner;

public class Exercício10 
{

    
    public static void main(String[] args) 
    {
      
        int número;
        System.out.println("Conversor de número em mês");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");
        número = leitura.nextInt();
        
        if(número == 1){
            System.out.println("O mês é Janeiro");
        } else if(número == 2){
            System.out.println("O mês é Fevereiro");
        } else if(número == 3){
            System.out.println("O mês é Março");
        } else if(número == 4){
            System.out.println("O mês é Abril");
        } else if(número == 5){
            System.out.println("O mês é Maio");
        } else if(número == 6){
            System.out.println("O mês é Junho");
        } else if(número == 7){
            System.out.println("O mês é Julho");
        } else if(número == 8){
            System.out.println("O mês é Agosto");
        } else if(número == 9){
            System.out.println("O mês é Setembro");
        } else if(número == 10){
            System.out.println("O mês é Outubro");
        } else if(número == 11){
            System.out.println("O mês é Novembro");
        } else if(número == 12){
            System.out.println("O mês é Dezembro");
        } else{
            System.out.println("Não existe mês com esse número!");
        }
        
    }
    
}
