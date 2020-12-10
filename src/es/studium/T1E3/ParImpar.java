package es.studium.T1E3;

import java.util.Scanner;

/*Realizar un programa en PSEUDOCÓDIGO que lea un número y
nos diga si el número es par o si es impar*/

public class ParImpar
{

	public static void main(String[] args)
	{
		//Abrimos teclado
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		int num;
		
		//Pedir num al usuario
		System.out.println("Escriba un número entero: ");
		
		//LEER num
		num = teclado.nextInt();
		
		//Cerrar teclado
		teclado.close();
		
		//ESTRUCTURA SI
		if (num%2==0)
		{
			System.out.println(num + " es PAR.");
		}
		else
		{
			System.out.println(num + " es IMPAR.");
		}//FIN SI

	}

}
