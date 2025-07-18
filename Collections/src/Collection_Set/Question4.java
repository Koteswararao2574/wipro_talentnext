package Collection_Set;

import java.util.TreeSet;
import java.util.Iterator;

public class Question4 {
	public static void main(String[] args) {
		Cnames cn = new Cnames();
		cn.saveCountryNames("India");
		cn.saveCountryNames("Russia");
		System.out.println(cn.saveCountryNames("Israel"));
		System.out.println(cn.getCountry("India"));
		System.out.println(cn.getCountry("America"));
	}

}

class Cnames {
	TreeSet<String> countryNames = new TreeSet<>();

	TreeSet<String> saveCountryNames(String name) {
		countryNames.add(name);
		return countryNames;
	}

	String getCountry(String name) {
		Iterator<String> it = countryNames.iterator();
		while (it.hasNext()) {
			String cname = it.next();
			if (cname.equals(name)) {
				return "Searching for " + name + ": FOUND";
			}
		}
		return "Searching for " + name + ": NOT FOUND";
	}
}
