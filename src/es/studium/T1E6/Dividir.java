package es.studium.T1E6;

import java.util.Scanner;

/*Realizar un programa en PSEUDOC�DIGO que lea dos n�meros y
mediante una funci�n, calcule la divisi�n de ambos.*/

public class Dividir
{

	public static void main(String[] args)
	{
		//VARIABLES
		int num1, num2;
		float resultado; 
		
		//OBJETO teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pedir num1
		System.out.println("Escriba un n�mero: ");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//LEER num2
		do
		{
			System.out.println("Escriba otro n�mero (distinto de 0): ");
			num2 = teclado.nextInt();
			
		}while(num2==0);
		
		//Cerrar teclado
		teclado.close();
		
		//LLAMADA a la funci�n
		resultado = dividir(num1, num2);
		
		//ESCRIBIR resultado
		System.out.println("El resultado de " + num1 + " / " + num2 + " = " + resultado);
	}
	
	public static float dividir(int a, int b) 
	{
		return((float)a/(float)b);
	}

}
