package assistedproject2;

public class WaitSleep {

	 private static Object obj = new Object();   
	 public static void main(String args)throws InterruptedException {
		 
	        //pause process for three second
		 Thread.sleep(3000);  
		 
	        System.out.println( Thread.currentThread().getName() +   
	                " Thread is woke up after three second");  
	        //create synchronize context from which we call Wait() method  
	        synchronized (obj) {
	       //use wait() method to set obj in waiting state for three seconds
	        	 obj.wait(3000);  
	        	 
	        	   System.out.println(obj + " Object is in waiting state and woke up after 3 seconds");   
	        }
	 }
}
