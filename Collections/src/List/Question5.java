package List;
import java.util.Iterator;
import java.util.Vector;
public class Question5 {
	public static void main(String[] args) {
		Vector<String> months = new Vector<>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("Decemer");

		Iterator<String> it = months.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
