package assistedproject3;

public class CallMethod {


   int val=10;
   int operation(int val) {
		val =val+10/100;
		return(val);
	}

	public static void main(String args[]) {
		CallMethod d = new CallMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(0);
		System.out.println("After operation value of data is "+d.val);
		}

}
