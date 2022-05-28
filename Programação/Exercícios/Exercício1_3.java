package exercício1;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

        int a;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Esse programa lê se o número é par ou impar!");
        System.out.print("Digite o número: ");
        a = leitura.nextInt();
        
        if(a%2==0){
            
            System.out.println("Par!");
            
        }else{
            System.out.println("Impar!");
        }
    }

}
