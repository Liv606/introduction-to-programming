package exercício15_6;


public class Exercício15_6 
{

    
    public static void main(String[] args) 
    {
        
        int m[][] = new int[3][4];
int v[] = new int[12];

int k = 0;
int j;
int i;
int aux;

for(i = 0; i < m.length; i++) 
{
	for(j = 0; j < m[0].length; j++) 
      {
            m[i][j] = (int) (Math.random()*(30 - 0 + 1)) + 0;
            v[k] = m[i][j];
            k = k + 1;
	}
}


for(k = 0; k < v.length; k++) 
{
  for(j = k + 1; j < v.length; j++) 
  {
     if(v[j] > v[k]) 
     {
        aux = v[k];
        v[k] = v[j];
        v[j] = aux;
     }
  }
}

k = 0;
for(i = 0; i < m.length; i++) 
{
	for(j = 0; j < m[0].length; j++) 
      {
            m[i][j] = v[k];
            k = k + 1;
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
