package exerc�cio9_3;


import java.util.Scanner;

public class Exerc�cio9_3 
{

    
    public static void main(String[] args) 
    {
        
        double pre�o, c�digo;
        System.out.println("Leitor de produtos");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o pre�o: ");
        pre�o = leitura.nextDouble();
        System.out.print("Digite o c�digo: ");
        c�digo = leitura.nextDouble();
         
        if(c�digo == 1){
            System.out.println("Proced�ncia: Sul; Pre�o: R$" + pre�o);
        } else if(c�digo == 2){
            System.out.println("Proced�ncia: Norte; Pre�o: R$" + pre�o);
        } else if(c�digo == 3){
            System.out.println("Proced�ncia: Leste; Pre�o: R$" + pre�o);
        } else if(c�digo == 4){
            System.out.println("Proced�ncia: Oeste; Pre�o: R$" + pre�o);
        } else if(c�digo == 5 || c�digo == 6){
            System.out.println("Proced�ncia: Nordeste; Pre�o: R$" + pre�o);
        } else if(c�digo == 7 || c�digo == 8 || c�digo == 9){
            System.out.println("Proced�ncia: Sudeste; Pre�o: R$" + pre�o);
        } else if(c�digo>=10 && c�digo<=20){
            System.out.println("Proced�ncia: Centro-oeste; Pre�o: R$" + pre�o);
        } else if(c�digo>=25 && c�digo<=30){
            System.out.println("Proced�ncia: Nordeste; Pre�o: R$" + pre�o);
        } else{
            System.out.println("Proced�ncia: Importado; Pre�o R$" + pre�o);
        }
        
    }
    
}

