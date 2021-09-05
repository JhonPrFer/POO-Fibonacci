
public class Fibonacci {
	
	public static void main(String[] args) {
		
		long num1 = 0;
		long num2 = 1;
		int cont = 0;
		while(cont<=100) {
			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
			num1+=num2;
			num2+=num1;
			cont++;
		}
	}

}
