package assistedproject5;

public class Throws {

	static void main() throws IllegalAccessException{
		System.out.println("Now inside value()");
		throw new  IllegalAccessException("main");
	}
	
	public static void main(String[] args) {
		try {
			main();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Now value already in");
		}
	}
}
