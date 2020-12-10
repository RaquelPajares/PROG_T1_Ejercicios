package es.studium.T1E4;

import java.util.Scanner;

/*Realizar un programa en PSEUDOCÓDIGO que lea dos números y me
indique los números pares que hay entre ellos.*/

public class Pares
{

	public static void main(String[] args)
	{
		//Variables
		int num1, num2, i; 
		
		//Abrir teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pedir num1
		System.out.println("Escriba un número entero: ");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//Pedir num2
		System.out.println("Escriba otro número entero: ");
		
		//LEER num2
		num2 = teclado.nextInt();
		
		//Cerramos teclado
		teclado.close();
		
		//Escribimos los números pares entre num1 y num2
		for(i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
