package exemplo12;

import java.util.Scanner;

public class Exemplo12 
{

    
    public static void main(String[] args) 
    {
        
        String nome, sexo;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = leitura.nextLine();
        System.out.print("Informe o sexo(F/M): ");
        sexo = leitura.nextLine();
        
        if((sexo.equals("M")) || (sexo.equals("m"))){
            System.out.println("Seja bem vindo Sr. " + nome);
        } else if((sexo.equals("F")) || (sexo.equals("f"))){
            System.out.println("Seja bem vinda Sra. " + nome);
        }
        
    }
    
}
