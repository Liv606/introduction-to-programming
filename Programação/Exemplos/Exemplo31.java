package exemplo31;


public class Exemplo31 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[10];
        
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*(100 - 1 + 1)) + 1;
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i] + "\t");
        }
        System.out.println("");
    }
    
}
