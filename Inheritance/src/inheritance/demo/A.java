package inheritance.demo;
import java.util.Scanner;

public class A {
	int a,b;
	void sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers you want to Add: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The Addition of numbers is: "+(a+b));
		sc.close();
	}

}
