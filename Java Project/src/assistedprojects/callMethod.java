package assistedprojects;

public class callMethod {


   int val=10;
   int operation(int val) {
		val =val+10/100;
		return(val);
	}

	public static void main(String args[]) {
		callMethod d = new callMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(0);
		System.out.println("After operation value of data is "+d.val);
		}

}
