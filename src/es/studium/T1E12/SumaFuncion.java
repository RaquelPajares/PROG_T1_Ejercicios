package es.studium.T1E12;

import java.util.Scanner;

/*Suma Funci�n- Realizar un programa en PSEUDOC�DIGO que lea dos n�meros
enteros por teclado y muestre la suma de ambos mediante una funci�n.*/

public class SumaFuncion
{

	public static void main(String[] args)
	{
		//VARIABLES
		int num1, num2, r; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro n�mero: ");
		num2 = teclado.nextInt(); 
		
		teclado.close();
		
		//LLAMADA a la FUNCI�N
		r = suma(num1, num2);
		
		//ESCRIBIR resultado
		System.out.println("El resultado de " + num1 + " + " + num2 + " = " + r);
	}
	
	public static int suma(int a, int b) 
	{
		return(a+b);
	}

}
