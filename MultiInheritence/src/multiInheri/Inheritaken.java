package multiInheri;

public class Inheritaken implements Add,Sub{
	public static void main(String[] args) {
		Inheritaken i=new Inheritaken();
		i.add();
		i.sub();
	}
	
	@Override
	public void add() {
		System.out.println("Addition= "+(2+5));
	}
	
	@Override
	public void sub() {
		System.out.println("Substraction= "+(5-2));
	}
}
