package exercício9_6;


public class Exercício9_6 
{

    
    public static void main(String[] args) 
    {
        
        int a[][] = new int[4][5];
        int cont = 10;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = cont;
                cont = cont + 10;
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
