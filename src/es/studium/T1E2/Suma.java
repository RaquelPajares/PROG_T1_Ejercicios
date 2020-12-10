package es.studium.T1E2;

import java.util.Scanner;

/* Realizar un programa que lea dos n�meros enteros
por teclado y muestre la suma de ambos.*/

public class Suma
{

	public static void main(String[] args)
	{
		//Necesitamos leer por teclado, as� que declaramos objeto teclado.
		Scanner teclado = new Scanner (System.in);
		
		//Variables
		int num1, num2; 
		
		//Pedir n�mero al usuario
		System.out.println("Escriba un n�mero entero: ");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//Pedir otro n�mero al usuario
		System.out.println("Escriba otro n�mero entero: ");
		
		//LEER num2
		num2 = teclado.nextInt(); 
		
		//Cerramos objeto teclado
		teclado.close();
		
		//ESCRIBIR num1 + num2
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		
	}

}
