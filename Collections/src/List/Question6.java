package List;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Question6 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100,"Sai","sai@gmail.com","Male",10000);
		Employee emp2 = new Employee(101,"Venkata","venkata@gmail.com","Male",15000);
		Vector<Employee> v = new Vector<>();
		v.add(emp1);
		v.add(emp2);
		System.out.println("Using Iterator");
		Iterator<Employee> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("Using Enumeration");
		Enumeration<Employee> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
	}
}
