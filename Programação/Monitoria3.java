package monitoria.pkg3;


public class Monitoria3 
{

    
    public static void main(String[] args) 
    {
        
        /*do{
            System.out.println("Hello world");
        }while(false); */
        
        /*int i = 0;
        while(i<5){
            System.out.println(i);
            i = i+1;
        }*/
          
        int i = 7;
        int j = 20;
        int soma = 0;
       /* int contador = 0;
        while(contador < j){
            soma = soma + i;
            contador++;
            
        }*/
        for(int contador = 0; contador < j; contador++){
            soma = soma + i;
            System.out.println(contador);
        }
        System.out.println(soma);
        
    }
    
}
