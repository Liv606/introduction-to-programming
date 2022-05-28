package exercício17_5;


public class Exercício17_5 
{

   
    public static void main(String[] args) 
    {
        
        int a[] = new int [200];
        int maior = 7;
        int menor = 3756;
        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*(3756 - 7 + 1)) + 7;
        }
        
        for (int i = 0; i < a.length; i++) {
                if (a[i] < menor) {
                menor  = a[i];
                }
            
        }
        
        for (int i = 0; i < a.length; i++) {
                if (a[i] > maior) {
                maior  = a[i];
            }
            
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
        
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
    }
    
}
