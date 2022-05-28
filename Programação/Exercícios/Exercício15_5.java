package exercício15_5;


public class Exercício15_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[100];
        int aux;
        
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*(100 - 0 + 1)) + 0;
        
            for(int j = i - 1; j>=0; j--){
                if(a[j] ==  a[i]){
                    i--; 
                }
            }
        }
        
        for(int i = 0; i<a.length; i++){
            for(int j = i + 1; j<a.length; j++){
                if(a[j] < a[i]){
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
}
