package exercício10_5;


public class Exercício10_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[50];
        
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*(248 - 27 + 1)) + 27;
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
}
