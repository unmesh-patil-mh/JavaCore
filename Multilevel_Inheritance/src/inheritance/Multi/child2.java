package inheritance.Multi;

public class child2 extends child1{
	int e;
	int f;
	void dikha() {
		e = 80;
		f = 120;
		System.out.println("The Numbers of Last child are:"+"\n Number 5="+e+"\n Number 6="+f);
	}
	
	public static void main(String[] args) {
		child2 c2=new child2();
		c2.display();
		c2.show();
		c2.dikha();
	}
}
