
public class Fibonacci {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		while(num1 <= 100 && num2 <=100 ) {
			System.out.print(num1 + " ");
			System.out.print(num2 + " " );
			num1+=num2;
			num2+=num1;
		}
    
	}

}
