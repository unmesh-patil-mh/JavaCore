package inheritance.Multi;
import java.util.Scanner;

public class parent {
	int a,b;
	void display() {
		Scanner sc = new Scanner(System.in);
		a = 10;
		b = 20;
		sc.close();
		System.out.println("The Values of parent are Are"+"\n number 1="+a+"\n Number 2="+b);
	}
//	public static void main(String[] args) {
//		parent p = new parent();
//		p.display();
//	}
}
