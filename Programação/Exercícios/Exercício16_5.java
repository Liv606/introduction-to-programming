package exercício16_5;

import java.util.Scanner;

public class Exercício16_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[80];
        int maior = 0;
        int menor = 0;
        int n;
        
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 9: ");
        n = leitura.nextInt();
        
        for (int i = 0; i < a.length; i++) {
            
            a[i] = (int)(Math.random()*(9 - 0 + 1)) + 0;

        }
        
        /*for (int i = 0; i < a.length; i++) {
            if(a[i] < 5){
                menor++;
            }else{
                maior++;
            }
        }
                                                                      parte a
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        System.out.println("");
        System.out.println("Maiores que 5: " + maior);
        System.out.println("Menores que 5: " + menor); */
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] < n){
                menor++;
            }else{
                maior++;
            }
        }
                                                                    //parte b
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        System.out.println("");
        System.out.println("Maiores que " + n + ": " + maior);
        System.out.println("Menores que " + n + ": " + menor);
  
    }
    
}
