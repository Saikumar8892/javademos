package assistedproject5;

public class main {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.out.println("55");
		}
		catch(ArithmeticException e){
			System.out.println("Catch : exception");
		}
		finally {
			System.out.println("Finally executed");
		}
	}
}
