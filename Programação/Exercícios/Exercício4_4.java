package exercício4;

import java.util.Scanner;

public class Exercício4 
{

    
    public static void main(String[] args) 
    {
       
        int n, r;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 9: ");
        n = leitura.nextInt();
        
        if(n == 1){
            for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            } 
    } else if(n == 2){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            } 
    } else if(n == 3){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            } 
    } else if(n == 4){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            } 
    
    } else if(n == 5){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            } 
    } else if(n == 6){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            }
    } else if(n == 7){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            } 
    } else if(n == 8){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            }
    } else if(n == 9){
        for(int i = 1; i<=10; i = i + 1){
                r = n * i;
                System.out.println(r);
            }
    } else {
            System.out.println("Esse número não está entre 1 e 9!!!");
    }
    }
}
