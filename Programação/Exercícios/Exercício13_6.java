package exercício13_6;


public class Exercício13_6 
{

    
    public static void main(String[] args) 
    {
        
        int v[] = new int [20];
        int a[][] = new int [4][5];
        int k = 0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                v[k] = (int)(Math.random()*(80 - 31 + 1)) + 31;
                a[i][j] = v[k];
                k++;
            } 
            }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}