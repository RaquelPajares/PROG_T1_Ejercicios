package es.studium.T14;

import java.util.Scanner;

/*Potencia2- Realizar un programa en PSEUDOC�DIGO que calcule a elevado a b
mediante una funci�n.*/

public class Potencia2
{

	public static void main(String[] args)
	{
		//VARIABLES
		int a, b; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un n�mero para la base: ");
		a = teclado.nextInt(); 
		
		System.out.println("Dame un n�mero para el exponente: ");
		b = teclado.nextInt(); 
		
		teclado.close();
		
		System.out.println(a + "^" + b + " = " + potencia(a, b));
	}
	
	public static int potencia(int base, int exponente)
	{
		int i, resultado; 
		resultado=1; 
		
		for (i=1;i<=exponente;i++) 
		{
			resultado = resultado*base; 
		}
		
		return(resultado); 
	}

}
