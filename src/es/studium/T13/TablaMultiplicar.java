package es.studium.T13;

import java.util.Scanner;

/*Tabla Multiplicar- Realizar un programa en PSEUDOCÓDIGO que lea un número
por teclado y escriba su tabla de multiplicar del 0 al 10.*/

public class TablaMultiplicar
{

	public static void main(String[] args)
	{
		//VARIABLES
		int entero, i; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número para multiplicarlo del 0 al 10: ");
		entero = teclado.nextInt(); 
		
		teclado.close();
		
		for(i=0;i<=10;i++)
		{
			System.out.println(entero + " x " + i + " = " + (entero*i));
		}
	}

}
