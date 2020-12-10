package es.studium.T1E2;

import java.util.Scanner;

/* Realizar un programa que lea dos números enteros
por teclado y muestre la suma de ambos.*/

public class Suma
{

	public static void main(String[] args)
	{
		//Necesitamos leer por teclado, así que declaramos objeto teclado.
		Scanner teclado = new Scanner (System.in);
		
		//Variables
		int num1, num2; 
		
		//Pedir número al usuario
		System.out.println("Escriba un número entero: ");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//Pedir otro número al usuario
		System.out.println("Escriba otro número entero: ");
		
		//LEER num2
		num2 = teclado.nextInt(); 
		
		//Cerramos objeto teclado
		teclado.close();
		
		//ESCRIBIR num1 + num2
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		
	}

}
