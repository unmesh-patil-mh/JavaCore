package set;
import java.util.Map;
import java.util.HashMap;

public class HashMapss {
	public static void main(String[] args) {
		Map<Integer,String> s=new HashMap<>();
		s.put(1,"Unmesh");
		s.put(2, "Aayush");
		s.put(3, "Yash");
		s.put(4, "Suyash");
		System.out.println(s);
		
		for(Map.Entry<Integer,String>m:s.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
