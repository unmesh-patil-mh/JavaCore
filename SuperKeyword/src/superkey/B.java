package superkey;

public class B extends A{
	int x=40;
	void show() {
		System.out.println("The Number is not Overridden: ");
		System.out.println(super.x);
	}
}
