package List;
import java.util.ArrayList;
import java.util.Iterator;
public class Question2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sai Venkata Chandran");
		list.add("Bhupathi Kumar");
		list.add("Niharika");
		list.add("Hema Latha");
		list.add("Ganesh Sai");
		printAll(list);
	}
	
	static void printAll(ArrayList<String> names) {
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
	}
}
