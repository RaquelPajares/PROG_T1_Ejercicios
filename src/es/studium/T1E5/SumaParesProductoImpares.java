package es.studium.T1E5;

/*Realizar un programa en PSEUDOCÓDIGO
que calcule la suma de los 20 primeros números pares y el producto de los 20
primeros números impares simultáneamente.*/

public class SumaParesProductoImpares
{

	public static void main(String[] args)
	{
		//VARIABLES
		int suma, producto, i; 
		suma = 0;
		producto = 1; 
		
		//BUCLE for suma y producto
		for(i=1;i<=40;i++)
		{
			//SI
			if(i%2==0)
			{
				suma = suma + i;
			}
			else
			{
				producto = producto * i;
			}	
		}
		
		//ESCRIBIMOS RESULTADOS
		System.out.println("La suma de los 20 PRIMEROS números PARES = " + suma);
		System.out.println("El producto de los 20 PRIMEROS números IMPARES = " +  producto);

	}

}
