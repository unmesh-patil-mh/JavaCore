package constructor;
import java.util.Scanner;

public class Constr {
	int a,b;
	void constr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		a=sc.nextInt();
		System.out.println("Enter the Second Number");
		b=sc.nextInt();
		System.out.println("The Sum of number is:"+(a+b));
	}
}
