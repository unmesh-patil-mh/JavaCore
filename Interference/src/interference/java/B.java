package interference.java;

public class B implements Add{
	public static void main(String[] args) {
		B b=new B();
		b.add();
		
	}

	@Override
	public void add() {
		System.out.println("The Sum of Our Numbers is= "+(2+4));
		
	}
	
	
	
}
