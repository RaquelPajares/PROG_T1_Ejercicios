package es.studium.T1E7;

import java.util.Scanner;

/*Realizar un programa en PSEUDOCÓDIGO que lea dos números por
teclado e indique si son iguales o cuál es mayor de los dos.*/

public class Compara
{

	public static void main(String[] args)
	{
		//VARIABLES
		int num1, num2; 
		
		//ABRIR teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pedir num1
		System.out.println("Escriba un número entero: ");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//Pedir num2
		System.out.println("Escriba otro número entero: ");
		
		//LEER num2 
		num2 = teclado.nextInt();
		
		//CERRAR teclado
		teclado.close();
		
		//ESCRIBIR comparación números - BUCLE IF
		if(num1==num2)
		{
			System.out.println(num1 + "=" + num2);
		}
		else
		{
			if(num1<num2)
			{
				System.out.println(num1 + "<" + num2);
			}
			else
			{
				System.out.println(num1 + ">" + num2);
			}//FIN SI
		}//FIN SI
	}

}
