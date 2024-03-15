package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		double res;
		
		
		

		try {
			res = num1/num2;
			System.out.println("Resultado "+res);
		} catch (Exception e) {
			System.err.println("Estás amamonao loco");
		}
		
	}

}
