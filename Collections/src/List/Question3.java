package List;
import java.util.ArrayList;
import java.util.Iterator;
public class Question3 {
	public static void main(String[] args) {
		ArrayList<Number> n = new ArrayList<>();
		n.add(10);
		n.add(13.15);
		n.add(13.05f);
		n.add(100L);
		printAll(n);
	}
	
	static void printAll(ArrayList<Number> list) {
		Iterator<Number> it = list.iterator();
		while(it.hasNext()) {
			Number num =   it.next();
			System.out.println(num);
		}
	}
}
