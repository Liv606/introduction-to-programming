package exemplo34;

import java.util.Scanner;

public class Exemplo34 
{

    
    public static void main(String[] args) 
    {
        
        int m[][] = { {33,21,4,1},
                      {15,7,32,28},
                      {25,16,9,2},
                      {3,14,6,5} };
        int n;
        
        Scanner leitura = new Scanner(System.in);
        System.out.print("Qual valor deseja buscar na matriz: ");
        n = leitura.nextInt();
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[0].length; j++) {
                if(m[i][j] == n){
                    System.out.println("Encontrei " + n + " na coluna " + j + " na linha " + i);
                }
              
            }
            
        }
        
    }
    
}
