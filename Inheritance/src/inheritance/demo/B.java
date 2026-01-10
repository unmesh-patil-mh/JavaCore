package inheritance.demo;
import java.util.Scanner;

public class B extends A{
	int c,d;
	void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers you want to Substract: ");
		c=sc.nextInt();
		d=sc.nextInt();
		System.out.println("The Substraction of the numbers is: "+(c-d));
		sc.close();
	}

	public static void main(String[] args) {
		B b=new B();
		b.sum();
		b.sub();

	}

}
