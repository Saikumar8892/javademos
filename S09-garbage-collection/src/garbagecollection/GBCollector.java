package garbagecollection;

public class GBCollector {

public static void main(String[] args) {
		
		Object obj1 = new GBCollector();
		Object obj2 = new GBCollector();
		
		obj1 = null;
		obj2 = null;
		
	}
	
  GBCollector() {
		System.out.println(this + " created...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " finalized...");
	}
}
