package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFile {
	public static void main(String[] args) {
		try {
			BufferedReader b=new BufferedReader(new FileReader("E:\\Example.txt"));
			String line;
			while((line=b.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}
}
