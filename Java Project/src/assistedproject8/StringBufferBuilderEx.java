package assistedproject8;

public class StringBufferBuilderEx {

	 public static void concat1(String s1)
	    {
	        s1 = s1 + "Journey begins";
	    }
	 public static void concat2(StringBuilder s2)
	    {
	        s2.append("Journey begins");
	    }
	 public static void concat3(StringBuffer s3)
	    {
	        s3.append("Journey begins");
	    }
	 
	 public static void main(String[] args)
	    {
		 String s1 = "welcome";
		 System.out.println("String: " + s1);
		 
		 StringBuilder s2 = new StringBuilder("to new");
		 concat2(s2);
		 System.out.println("StringBuilder: " + s2);
		 
		 StringBuffer s3 = new StringBuffer("Journey begins");
		 concat3(s3);
		 System.out.println("StringBuffer: " + s3);
	    }
}
