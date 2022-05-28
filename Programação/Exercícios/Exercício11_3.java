package exercício11;

import java.util.Scanner;

public class Exercício11 
{

    
    public static void main(String[] args) 
    {
        
        double t;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        t = leitura.nextDouble();
        
        if(t>32){
            System.out.println("Muito quente");
        } else if(t<32 && t>=25){
            System.out.println("Quente");
        } else if(t<25 && t>=14){
            System.out.println("Moderada");
        } else if(t<14 && t>=8){
            System.out.println("Frio");
        } else if(t<8 && t>=-2){
            System.out.println("Muito frio");
        } else if(t<-2 && t>=-12){
            System.out.println("Extremamente frio");
        } else{
            System.out.println("Congelante");
        }
        
    }
    
}
