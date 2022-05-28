package monitoria.pkg1;

import java.util.Scanner;

public class Monitoria1 
{

    
    public static void main(String[] args) 
    {
      
        int a;
        int b;
        int c;
        int soma;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa soma 3 números inteiros.");
        System.out.print("Digite o primeiro número: ");
        a = leitura.nextInt();
        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = leitura.nextInt();
        soma = a + b + c;
        System.out.println("O resultado da soma é: " + soma);
        
    }
    
}
