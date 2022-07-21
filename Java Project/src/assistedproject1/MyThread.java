package assistedproject1;

public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("Hello Thread");
}
 	public static void main( String args[] )
 	{
  		MyThread t1 = new  MyThread();
  		t1.start();
 	}
}
