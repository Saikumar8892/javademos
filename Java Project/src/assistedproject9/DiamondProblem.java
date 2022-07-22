package assistedproject9;

interface Multiple
{
	 public default void display() {
		System.out.println("The multiple inheritance not supported java");
	}
}
interface Multilevel
{
	public default void display() {
		System.out.println("The multilevel inheritance supported in java");
	}
}
public class DiamondProblem implements Multiple,Multilevel
{
 public void display() {
	Multiple.super.display();
	Multilevel.super.display();
}
public static void main(String[] args) {
	 DiamondProblem obj = new DiamondProblem();
	obj.display();
}
}
