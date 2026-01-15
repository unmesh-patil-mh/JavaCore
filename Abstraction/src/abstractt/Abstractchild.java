package abstractt;

public  class Abstractchild extends Abstrparent {
	void sub() {
		int c=40;
		int d=20;
		System.out.println("Substraction of our Number is: "+(c-d));
	}
	
	public static void main(String[] args) {
		Abstractchild ab=new Abstractchild();
		ab.sum();
		ab.sub();
		
	}

	@Override
	void show() {
		System.out.println("Sum = "+(10+20));
		
	}
}
