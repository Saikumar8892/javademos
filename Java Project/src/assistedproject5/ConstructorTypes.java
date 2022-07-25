package assistedproject5;


	class Employee{
		int id;
		String name;
		float salary;
		public Employee() {
			id=14582;
			name="SAI";
			salary = 20000;
		}
		Employee(int id, String name,float salary){
			this.id = id;
			this.name=name;
			this.salary = salary;
		}
		void display() {
			System.out.println("id is" +id);
			System.out.println("name is" +name);
			System.out.println("salary is" +salary);
		}
		
	}

	public class ConstructorTypes {

		public static void main(String[] args) {
			Employee emp1 = new Employee(); 
			emp1.display();
			Employee emp2 = new Employee(11180, "NAGASAI", 25000);  
			emp2.display();
			

		}

	}

