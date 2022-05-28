
package exercicio6;

import java.util.Scanner;

public class Exercicio6 
{

    
    public static void main(String[] args) 
    {
       
        double idade, altura, horas, peso;
        System.out.println("Qualificação piloto");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        idade = leitura.nextDouble();
        System.out.print("Digite a altura: ");
        altura = leitura.nextDouble();
        System.out.print("Digite a quantidade de horas de voo: ");
        horas = leitura.nextDouble();
        System.out.print("Digite o peso: ");
        peso = leitura.nextDouble();
        
        if(idade>=22 && idade<=40 && altura>=1.75 && horas>=1600 && peso>=65 && peso<=95){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Negado!");
        }
        
    }
    
}
