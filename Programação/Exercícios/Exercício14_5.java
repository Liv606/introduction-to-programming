package exercício14_5;


public class Exercício14_5 
{

    
    public static void main(String[] args) 
    {
        
        int a[] = new int[100];
        int aux;
        
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*(200 - 1 + 1)) + 1;
        
            for(int j = i - 1; j>=0; j--){
                if(a[j] ==  a[i]){
                    i--; 
                }
            }
        }
        
        /*for(int i = 0; i<a.length; i++){
            for(int j = i + 1; j<a.length; j++){
                if(a[i] == a[j]){
                    a[j] = (int) (Math.random()*(200 - 1 + 1)) + 1;
                    j = 0;
                    i = 0;
                }
            }
        }*/
        
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
