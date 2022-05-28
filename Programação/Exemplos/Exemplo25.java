package exemplo25;


public class Exemplo25 
{

    
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        double soma = 0;
        double t;
        
        for(int i = 0; i < a.length; i++){
            soma = soma + a[i];
        }
        t = soma/a.length;
        System.out.println(t);
        
    }
    
}
