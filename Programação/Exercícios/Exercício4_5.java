package exercício4_5;


public class Exercício4_5 
{

    
    public static void main(String[] args) 
    {
       
        int a[] = new int[50];
        
        for(int i = 0; i<a.length; i++){
            a[i] = 3 + 2*i;
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
}
