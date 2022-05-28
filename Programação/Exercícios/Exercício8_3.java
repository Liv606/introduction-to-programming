
package exercício8;

import java.util.Scanner;

public class Exercício8 
{

    
    public static void main(String[] args) 
    {
        
        double peso, altura, imc;
        System.out.println("Gerador do seu IMC");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        peso = leitura.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = leitura.nextDouble();
        imc = peso/(altura*altura);
        
        if(imc<18.5){
            System.out.println("Você está abaixo do peso ideal!");
    } else if(imc<=24.9){
            System.out.println("Parabéns — você está em seu peso normal!");
    } else if(imc<=29.9){
            System.out.println("Você está acima de seu peso (sobrepeso)");
    } else if(imc<=34.9){
            System.out.println("Obesidade grau I");
    } else if(imc<=39.9){
            System.out.println("Obesidade grau II");
    } else{
            System.out.println("Obesidade grau III");
    }
        
    }
    
}
