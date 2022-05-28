package exemplo29;


public class Exemplo29 
{

   
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        int aux, i, j;
        
        for(i = 0; i<a.length; i++)
        {
            for(j = i + 1; j<a.length; j++)
            {
                if(a[j] < a[i])
                {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        
        for(i = 0; i<a.length; i++)
        {
            System.out.println(a[i] + "\t");
        }
        System.out.println();
        
    }
    
}
