package es.studium.T1E16;

import java.util.Scanner;

/*Realizar un programa en PSEUDOC�DIGO que calcule mediante una
funci�n la siguiente expresi�n: (b^2)-((4*a)*c)/(2*a)   */

public class Expresion
{

	public static void main(String[] args)
	{
		int a, b, c; 
		float r; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el n�mero equivalente para A: ");
		a = teclado.nextInt(); 
		
		System.out.println("Dame el n�mero equivalente para B: ");
		b = teclado.nextInt();
		
		System.out.println("Dame el n�mero equivalente para C: ");
		c = teclado.nextInt();
		
		teclado.close();
		
		r = expresion(a, b, c);
		
		System.out.println("(" + b + "^" + "2" + ")-((4*" + a + ")*" + c + ")/(2*" + a + "))=" + r);

	}
	public static float expresion(int a, int b, int c)
	{
		return (((b*b)-(4*a*c))/2*a);
	}

}
