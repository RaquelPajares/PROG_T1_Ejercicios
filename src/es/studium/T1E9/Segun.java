package es.studium.T1E9;

import java.util.Scanner;

/*Realizar un programa en PSEUDOCÓDIGO que lea dos números enteros
a y b por teclado. Si a<b obtener su suma. Si a>=b, obtener su multiplicación.

PROGRAMA Segun
VARIABLES
ENTERO a, b, resultado
INICIO
ESCRIBIR “Dame un número:”
LEER a
ESCRIBIR “Dame otro número:”
LEER b
SI a<b ENTONCES
resultado=a+b
ESCRIBIR “La suma del número1 y el número2 es:” + resultado
SI NO
resultado=a*b
ESCRIBIR “El producto del número1 por el número2 es:” + resultado
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

		System.out.println("Dame un número: ");
		a = teclado.nextInt();
		
		System.out.println("Dame otro número: ");
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
