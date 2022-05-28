package monitoria4;


public class Monitoria4 
{

   
    public static void main(String[] args) 
    {
       
        int a[] = new int[50];
        for(int i = 0; i<50; i++){
            a[i] = i + 1;
        }
        for(int i = 0; i<50; i++){
            System.out.println(a[i]);
        }
      /* for(int i:a){
         System.out.println(a[i]);
        }
        */ 
        
    }
    
}
