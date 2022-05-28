package exercício9_3;


import java.util.Scanner;

public class Exercício9_3 
{

    
    public static void main(String[] args) 
    {
        
        double preço, código;
        System.out.println("Leitor de produtos");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o preço: ");
        preço = leitura.nextDouble();
        System.out.print("Digite o código: ");
        código = leitura.nextDouble();
         
        if(código == 1){
            System.out.println("Procedência: Sul; Preço: R$" + preço);
        } else if(código == 2){
            System.out.println("Procedência: Norte; Preço: R$" + preço);
        } else if(código == 3){
            System.out.println("Procedência: Leste; Preço: R$" + preço);
        } else if(código == 4){
            System.out.println("Procedência: Oeste; Preço: R$" + preço);
        } else if(código == 5 || código == 6){
            System.out.println("Procedência: Nordeste; Preço: R$" + preço);
        } else if(código == 7 || código == 8 || código == 9){
            System.out.println("Procedência: Sudeste; Preço: R$" + preço);
        } else if(código>=10 && código<=20){
            System.out.println("Procedência: Centro-oeste; Preço: R$" + preço);
        } else if(código>=25 && código<=30){
            System.out.println("Procedência: Nordeste; Preço: R$" + preço);
        } else{
            System.out.println("Procedência: Importado; Preço R$" + preço);
        }
        
    }
    
}

