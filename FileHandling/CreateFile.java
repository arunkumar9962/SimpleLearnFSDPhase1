package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File f1 = new File("D:\\Pratical FSD\\FSD1/Sample.txt");
		
		try {
			if(f1.createNewFile()) {
				System.out.println("File" +f1.getName() + " is created sucessfully");
				
			}
		} catch (IOException e) {
			System.out.println("Exeption occured during file creation...");
			
		}
	}

}
