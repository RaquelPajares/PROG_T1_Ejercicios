package es.studium.T1E9;

import java.util.Scanner;

/*Realizar un programa en PSEUDOC�DIGO que lea dos n�meros enteros
a y b por teclado. Si a<b obtener su suma. Si a>=b, obtener su multiplicaci�n.

PROGRAMA Segun
VARIABLES
ENTERO a, b, resultado
INICIO
ESCRIBIR �Dame un n�mero:�
LEER a
ESCRIBIR �Dame otro n�mero:�
LEER b
SI a<b ENTONCES
resultado=a+b
ESCRIBIR �La suma del n�mero1 y el n�mero2 es:� + resultado
SI NO
resultado=a*b
ESCRIBIR �El producto del n�mero1 por el n�mero2 es:� + resultado
FIN SI
FIN 
*/

public class Segun
{

	public static void main(String[] args)
	{
		//VARIABLES
		int a, b;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un n�mero: ");
		a = teclado.nextInt();
		
		System.out.println("Dame otro n�mero: ");
		b = teclado.nextInt();
		
		teclado.close();

		if (a<b)
		{
			System.out.println("La suma del " + a + " + " + b + " es igual a " + (a+b));
		}
		else
		{
			System.out.println("El producto del " + a + " * " + b + " es igual a " + (a*b));
		}
		

	}

}
