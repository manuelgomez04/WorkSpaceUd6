package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a, b , c, x = 5;
		boolean seguir = false;
		String aux;
		
		
		
		do {
			
			try {
				
				System.out.println("Dato a");
				aux = sc.nextLine();
				a = Integer.parseInt(aux);
				System.out.println("Dato b");
				aux = sc.nextLine();
				b = Integer.parseInt(aux);
				System.out.println("Dato c");
				aux = sc.nextLine();
				c = Integer.parseInt(aux);
				
				CEcuacion2Grado ce = new CEcuacion2Grado(a, b, c);
				
				if (b == 0 && a == 0) {
					throw new EcuacionException("A y B son 0. No se puede continuar");
				} else {
					
				}
				if ((Math.sqrt(Math.pow(b, 2))-4*a*c)< 0) {
					System.out.println(ce.formulaMas(x)); 
				} else {
					System.out.println(ce.formulaMenos(x)); 
				}
				seguir = true;
			} catch (EcuacionException e) {
				System.out.println(e.getMessage());
			}
			
			
			
		} while (!seguir);
	}

}
