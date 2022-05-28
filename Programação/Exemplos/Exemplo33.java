package exemplo33;


public class Exemplo33 
{

    
    public static void main(String[] args) 
    {
        
        int [] [] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        
        for (int i = 0; i<matriz.length; i++) {
            
            for (int j = 0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }
    
}
