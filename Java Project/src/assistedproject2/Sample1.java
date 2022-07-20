package assistedproject2;

class Sample1 {

	private int number = 20;
	private String name = "SAI";
	private String city = "NANDYAL";
	private String state = "ANDHRA PRADESH";
	private String country = "INDIA";
	
	private String info() {
		return country;
	}
	private Sample1 () {
		System.out.println("Private Access Modifier");
	}
	
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		System.out.println(s.number);
		System.out.println(s.name);
		System.out.println(s.city);
		System.out.println(s.state);
		System.out.println(s.country);
		System.out.println(s.info());
		
	}
}
// in private they didn't access another class