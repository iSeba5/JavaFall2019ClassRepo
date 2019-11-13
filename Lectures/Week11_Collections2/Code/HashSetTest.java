import java.util.Set;
import java.util.HashSet;

public class HashSetTest{
	public static void main(String[] args){
		Set<String> s = new HashSet<String>();
		boolean b1 = s.add(new String("Hello "));
		System.out.println(b1);
		boolean b2 = s.add(new String("Hello "));
		System.out.println(b2);
		boolean b3 = s.add("Hello ");
		System.out.println(b3);

		boolean b4 = s.add("World\n");
		System.out.println(b4);
		boolean b5 = s.add("World\n");
		System.out.println(b5);
		boolean b6 = s.add(new String("World\n"));
		System.out.println(b6);

		for( String str : s ){
			System.out.print(str);
		}

		System.out.println(s.toString());

	}
}

