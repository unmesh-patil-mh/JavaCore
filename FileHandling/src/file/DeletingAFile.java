package file;

import java.io.File;

public class DeletingAFile {
	public static void main(String[] args) {
		File f=new File("E:\\Example.txt");
		if(f.delete()) {
			System.out.println("File Deleted Successfully "+f.getName());
		}
		else {
			System.out.println("Failed to delete file");
		}
	}
}
