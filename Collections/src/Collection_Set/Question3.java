package Collection_Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Question3 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("India");
		names.add("Russia");
		names.add("Israel");
		names.add("Germany");
		names.add("England");
		System.out.println(names);
		NavigableSet<String> reversed = names.descendingSet();
		System.out.println(reversed);
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		String search = "India";
		if(names.contains(search)) {
			System.out.println(search + " exist in TreeSet");
		}else {
			System.out.println(search + " does not exist in TreeSet");
		}
		

	}

}
