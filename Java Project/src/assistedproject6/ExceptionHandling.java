package assistedproject6;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args)  {
		
		int a, b, c, d;
		System.out.println("Enter two integers");
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a/b;
			d = a+b;
			System.out.println(a + "+" + b+" = " + c +", Remainder = " + d);
		}
		catch (ArithmeticException e) {
			System.out.println("Sai kumar");
		}
	 catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Input is required.");
	 }
		finally {
			System.out.println("Hello sai");
		}
	}
}
