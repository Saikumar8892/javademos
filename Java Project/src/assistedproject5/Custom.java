package assistedproject5;
class MyException extends Exception
{
	public MyException(String a) {
		
		super(a);
	}
}

public class Custom {

	public static void main(String[] args) {
		try {
			throw new MyException("temp");
		}
		catch(MyException ex) {
			System.out.println("Got");
			System.out.println("Got msg()");
		}
	}
}
