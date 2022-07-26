package readerwriter;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderWriter {

public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\test.txt");
		FileWriter fw = new FileWriter("D:\\testwriter.txt");
		
		int ch;
		while ( (ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}
