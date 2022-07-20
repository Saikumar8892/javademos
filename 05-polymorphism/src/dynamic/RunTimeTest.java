package dynamic;

public class RunTimeTest {

public static void main(String[] args) {
		
		MacBookPro pro = new MacBookPro();
		operateMac(pro);
		
		MacBookAir air = new MacBookAir();
		operateMac(air);
		
	}
	
	static void operateMac(MacBook mac) {
		mac.start();
		mac.shutdown();
	}
}
