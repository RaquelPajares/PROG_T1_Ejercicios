package es.studium.T1E12;

import java.util.Scanner;

/*Suma Función- Realizar un programa en PSEUDOCÓDIGO que lea dos números
enteros por teclado y muestre la suma de ambos mediante una función.*/

public class SumaFuncion
{

	public static void main(String[] args)
	{
		//VARIABLES
		int num1, num2, r; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número: ");
		num2 = teclado.nextInt(); 
		
		teclado.close();
		
		//LLAMADA a la FUNCIÓN
		r = suma(num1, num2);
		
		//ESCRIBIR resultado
		System.out.println("El resultado de " + num1 + " + " + num2 + " = " + r);
	}
	
	public static int suma(int a, int b) 
	{
		return(a+b);
	}

}
