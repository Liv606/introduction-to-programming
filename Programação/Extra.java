package extra;


public class Extra 
{

    
    public static void main(String[] args) 
    {
        
        int a[][] = new int [6][6];
        int primo = 0;
        int x = 2;
        boolean teste = true;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int)(Math.random()*(100 - 1 + 1)) + 1;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                while(x<a[i][j]){
                    
                    if(a[i][j]%x == 0){
                        teste = false;
                    }
                    x++;
                }
                if(teste = true){
                    primo++;
                }
                x = 2;
                teste = true;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("Números primos: " + primo);
        
    }
    
}
