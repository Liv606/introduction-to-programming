package exemplo38;


public class Exemplo38 
{

    
    public static void main(String[] args) 
    {
        
        int a[][] = new int [5][5];
        int v[] = new int[25];
        int k = 0;
        int aux;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int)(Math.random()*(50 - 1 + 1)) + 1;
                v[k] = a[i][j];
                k = k + 1;
            }
        }
        
        
        for(k = 0; k<a.length; k++)
        {
            for(int i = k + 1; i<a.length; i++)
            {
                if(v[i] <= v[k])
                {
                    aux = v[i];
                    v[i] = v[k];
                    v[k] = aux;
                }
            }
        }
        
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = v[b];
                b++;
            }
        }

        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for(k = 0; k < v.length; k++){
            System.out.print(v[k] + "\t");
        }
        System.out.println("");
        
        System.out.println("");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }
    
}
