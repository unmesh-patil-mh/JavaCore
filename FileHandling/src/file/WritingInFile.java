package file;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
	public static void main(String[] args) {
		try {
			FileWriter w=new FileWriter("E:\\Example.txt");
			w.write("Hii this is new File");
			w.write("\nHere is my second Statement");
			w.close();
		}catch(IOException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}
}
