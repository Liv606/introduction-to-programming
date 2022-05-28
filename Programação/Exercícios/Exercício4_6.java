package exercício4_6;


public class Exercício4_6 
{

    
    public static void main(String[] args) 
    {
        
        int a[][] = new int [4][5];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = i + 1;
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
