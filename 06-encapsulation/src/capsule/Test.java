package capsule;

public class Test {

public static void main(String[] args) {
		
		// no encapsulation
		Student student = new Student();
		student.id = 14582;
		student.name = "SAI";
		student.courseName = "JAVAFSD";
		student.printDetails();
		
		// writeonly object
		BankAccount acc = new BankAccount();
		acc.setAccountName("HDFC");
		acc.setAccountNumber(3568);
//		acc.setBalanceTotal(100);
		acc.printDetails();
		
		// readonly object
		Product product = new Product(2, "vivox80", 60000);
		String name = product.getName();
		System.out.println("Product Name: " + name);
		
	}
}
