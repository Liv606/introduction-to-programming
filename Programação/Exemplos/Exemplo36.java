package exemplo36;



public class Exemplo36 
{

    
    public static void main(String args[]) {  

      int a[][] = { {33,21,4,1},
                    {15,7,32,28},
                    {25,16,9,2},
                    {3,14,6,5} };
      
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(i==j){
                    System.out.print(a[i][j] + "\t");
                }
            }
        }
      
    }
}

