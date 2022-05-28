package exemplo24;


public class Exemplo24 
{

    
    public static void main(String[] args) 
    {
        
        int[] a = {4, 2, 9, 1, 5, 3, 8, 6, 7};
        int soma = 0;
        for(int i = 0; i < a.length; i++){
            soma = soma + a[i];
        }
        System.out.println(soma);
        
    }
    
}
