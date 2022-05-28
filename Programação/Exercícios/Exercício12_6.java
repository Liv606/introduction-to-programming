package exercício12_6;


public class Exercício12_6 
{

    
    public static void main(String[] args) 
    {
        
        int a[][] = new int[4][5];
        int v[] = new int[20];
        int k = 0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int)(Math.random()*(50 - 1 + 1)) + 1;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                v[k] = a[i][j];
                k++;
            }
        }
        
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println("");
    }
    
}
