package set;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Setts {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.addAll(Arrays.asList(4,5,6,7,8));
		System.out.println(s);
		
//		For Loop to get elements
		for(int i:s) {
			System.out.println(i);
		}
	}

}
