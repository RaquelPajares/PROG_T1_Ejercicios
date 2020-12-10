package es.studium.T1E15;

import java.util.Scanner;

/*Meses - Realizar un programa en PSEUDOCÓDIGO que lea un entero entre 1 y
12 y escriba por pantalla el nombre del mes al que corresponde.*/

public class Meses
{

	public static void main(String[] args)
	{
		int num; 
		
		Scanner teclado = new Scanner(System.in);

		do
		{
			System.out.println("Dime un número (1-12) y te diré a qué mes corresponde: ");
			num = teclado.nextInt();
		}while(num<1||num>12);
		
		teclado.close();
		
		switch (num)
		{
			case 1:
				System.out.println("ENERO");
				break;
			case 2:
				System.out.println("FEBRERO");
				break;
			case 3:
				System.out.println("MARZO");
				break;
			case 4:
				System.out.println("ABRIL");
				break;
			case 5:
				System.out.println("MAYO");
				break;
			case 6:
				System.out.println("JUNIO");
				break;
			case 7:
				System.out.println("JULIO");
				break;
			case 8:
				System.out.println("AGOSTO");
				break;
			case 9:
				System.out.println("SEPTIEMBRE");
				break;
			case 10:
				System.out.println("OCTUBRE");
				break;
			case 11:
				System.out.println("NOVIEMBRE");
				break;
			case 12:
				System.out.println("DICIEMBRE");
				break;
		} 
	}

}
