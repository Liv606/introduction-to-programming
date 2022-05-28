package exercício9_5;


public class Exercício9_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[50];
        
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*80 - 0 + 1) + 0;
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
}
