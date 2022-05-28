package exercício17_6;


public class Exercício17_6 
{

    
    public static void main(String[] args) 
    {
        
        int m[][] = new int[12][4];
	int[] qtd = {150,132,121,145,134,187,199,191,188,156,212,244};
	int[] pcs = {15,3,2,1};
	int i;
	int j;

	for(i = 0; i < m.length; i++) 
	{
    		for(j = 0; j < m[0].length; j++) 
    		{
        	m[i][j] = qtd[i]*pcs[j]; 
    }
}



for(i = 0; i < m.length; i++) 
{
	for(j = 0; j < m[0].length; j++) 
      {
      	System.out.print(m[i][j] + "\t");
      }
      System.out.println("");
}
    
    

}
}
