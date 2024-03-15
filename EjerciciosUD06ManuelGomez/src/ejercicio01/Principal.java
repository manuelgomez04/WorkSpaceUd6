package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		
//		1) Realizar un programa que haga las operaciones básicas de una calculadora solo con números enteros (sumar,
//		resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones que se pueden producir
//		(entrada de datos, división por cero, raíz de un número negativo, etc.)
		
		Scanner sc = new Scanner (System.in);
		
		int opcion, num1, num2, resul;
		String aux;
		
		
		
		do {
		
			System.out.println(""" 
					1 ---> Sumar
					2 ---> Multiplicar
					3 ---> Dividir 
					4 ---> Restar
					5 ---> Raíz cuadrada
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				
				try {
					System.out.println("Diga número 1");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Diga número 2");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul= num1+num2;
					
					System.out.println("El resultado es "+ resul);
					
				} catch (RuntimeException rs) {
					System.err.println("Dato introducido incorrecto");
				}
				
				break;
				
			case 2:
				
				try {
					System.out.println("Diga número 1");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Diga número 2");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul= num1*num2;
					
					System.out.println("El resultado es "+ resul);
					
				} catch (RuntimeException rs) {
					System.err.println("Dato introducido incorrecto");
				}
				
				break;
				
			case 3:
				
				try {
					System.out.println("Diga número 1");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Diga número 2");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul= num1/num2;
					
					System.out.println("El resultado es "+ resul);
					
				} catch (RuntimeException rs) {
					System.err.println("Dato introducido incorrecto");
				}
				
				
				break;
				
			case 4:
				
				try {
					System.out.println("Diga número 1");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Diga número 2");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul= num1-num2;
					
					System.out.println("El resultado es "+ resul);
					
				} catch (RuntimeException rs) {
					System.err.println("Dato introducido incorrecto");
				}
				
				break;

			case 5:
				
				try {
					System.out.println("Diga número 2");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					
					
					
					System.out.println("El resultado es "+ Math.sqrt(num1));
					
				} catch (RuntimeException rs) {
					System.err.println("Dato introducido incorrecto");
				}
				
				break;
			default:
				break;
			}
			
			
			
			
			
			
		} while (opcion != 0);
		
	}

}
