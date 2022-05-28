package exercício5;


public class Exercício5 
{

    
    public static void main(String[] args) 
    {
       
        int i = 0;
        double r = 0;
        
        while( r <= 1000){
            
            System.out.println(r);
            r = Math.pow(2,i);            
            i = i + 1;
            
        }
        
    }
    
}
