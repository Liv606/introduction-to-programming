package exemplo35;


public class Exemplo35 
{

    
    public static void main(String[] args) 
    {
        
        int m[][] = { {33,21,4,1},
                      {15,7,32,28},
                      {25,16,9,2},
                      {3,14,6,5} };

        double media;
        int cont = 0;
        double soma = 0;
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[0].length; j++) {
                soma = soma + m[i][j];
                cont++;
            }
        }
        media = soma/cont;
        System.out.println("Média dos números pares: " + media);
    }
    
}
