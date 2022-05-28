package exemplo26;


public class Exemplo26 
{

    
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        double soma = 0;
        double t;
        int c = 0;
        
        for(int i = 0; i <a.length; i++){
            
            if(a[i]%2 == 0){
            soma = soma + a[i];
            c = c + 1;
            }
        }
        t = soma/c;
        System.out.println(t);
        
    }
    
}
