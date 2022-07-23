package assistedproject5;

public class Throw {

	static void main(){
		try {
			throw new NullPointerException(" main ");
		}
		catch(NullPointerException e) {
			System.out.println("Now inside value");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			main();
		}
		catch(NullPointerException e) {
			System.out.println("Now value already in");
		}
	}
}
