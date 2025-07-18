package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Question1 {

	public static void main(String[] args) {
		CountryNames cn = new CountryNames();
		cn.saveCountryNames("India");
		cn.saveCountryNames("Russia");
		System.out.println(cn.saveCountryNames("Israel"));
		System.out.println(cn.getCountry("India"));
		System.out.println(cn.getCountry("America"));
	}

}

class CountryNames {
	HashSet<String> countryNames = new HashSet<>();

	HashSet<String> saveCountryNames(String name) {
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
