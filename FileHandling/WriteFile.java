package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
			FileWriter fwriter = new FileWriter("D:\\Pratical FSD\\FSD1/Sample.txt");
			fwriter.write("Hi Arun, Welcome to Java");
			fwriter.close();
			System.out.println("THe COntent is Sucessfully writen inside the file");
		} catch (IOException e) {
			
			System.out.println("Unexpected error occured..");
			e.printStackTrace();
			
			
		}

	}

}
