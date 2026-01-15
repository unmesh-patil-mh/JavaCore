package parameterised;

public class Parachild extends Paraconst{
	Parachild(int a,int b){
		super(a,b);
		System.out.println("The Substraction of the Number is: "+(a-b));
	}
	
	public static void main(String[] args) {
		Parachild p=new Parachild(5,2);
		
	}
}
