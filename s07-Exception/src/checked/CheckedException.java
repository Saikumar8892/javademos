package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {


	public static void main(String[] args) throws FileNotFoundException {
		
		CheckedException obj = new CheckedException();
		obj.readFromFile();

	}

	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("c:\\temp\\tes.txt");
	}

}
