package file;

import java.io.File;
import java.io.IOException;

public class CreatingAFile {
	public static void main(String[] args) {
		try {
			File f=new File("E:\\Example.txt");
			if(f.createNewFile()) {
				System.out.println("New File Created Successfully...");
			}
			else {
				System.out.println("File Already Exists..");
			}
		}catch(IOException e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}
}
