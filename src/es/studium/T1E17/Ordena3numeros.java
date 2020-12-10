package es.studium.T1E17;

import java.util.Scanner;

/*Ordena3números- Realizar un programa en PSEUDOCÓDIGO que lea tres
números enteros y los ordene de mayor a menor.*/ 

public class Ordena3numeros
{

	public static void main(String[] args)
	{
		int num1, num2, num3; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número: "); 
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número: ");
		num2 = teclado.nextInt();
		
		System.out.println("Dame un último número: "); 
		num3 = teclado.nextInt();

		teclado.close();
		
		//ESTÁ SIN TERMINAR
		if(num1>num2)
		{
			if(num2>num3)
			{
				System.out.println(num1 + ">" + num2 + ">" + num3);
			}
			else
			{
				System.out.println(num1 + ">" + num3 + ">" + num2);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2 + ">" + num3 + ">" + num1);
			}
			else 
			{
				System.out.println(num3 + ">" + num2 + ">" + num1);
			}
		}
	}

}
