package exercício.pkg4;

import java.util.Scanner;

public class Exercício4 
{

    
    public static void main(String[] args) 
    {
        
        String nome;
        String ra;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu RA: ");
        ra = leitura.nextLine();
        System.out.print("Digite o seu nome: ");
        nome = leitura.nextLine();
        System.out.println(ra + " - " + nome);
        
    }
    
}
