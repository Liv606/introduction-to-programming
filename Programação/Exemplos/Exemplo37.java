package exemplo37;


public class Exemplo37 
{

    
    public static void main(String[] args) 
    {
        
        int a[][] = new int [5][5];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(i==j) {
                    a[i][j] = 1;
                }else{
                    a[i][j] = 5;
                }
                
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
