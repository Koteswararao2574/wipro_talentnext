package Collections_Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Question6 {
	public static void main(String[] args) {
		
		// using Hashtable
		
		CountriesAndCapitals cc = new CountriesAndCapitals();
		cc.saveCountryCapital("India", "Delhi");
		System.out.println(cc.saveCountryCapital("Japan", "Tokyo"));
		System.out.println(cc.getCapital("India"));
		System.out.println(cc.getCountry("Delhi"));
		System.out.println(cc.reverseMapping());
		System.out.println(cc.getAllCountries());

	}

}


class CountriesAndCapitals{
	Hashtable<String,String> M1= new Hashtable<>();
	
	Hashtable<String,String> saveCountryCapital(String CountryName, String capital){
		M1.put(CountryName, capital);
		return M1;
	}
	String getCapital(String countryName) {
		return M1.getOrDefault(countryName, "Capital NOT FOUND");
	}
	String getCountry(String capitalName) {
		for(Map.Entry<String, String> entry: M1.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(capitalName)){
				return entry.getKey();
			}
		}
		return "Country NOT FOUND";
	}
	Hashtable<String, String> reverseMapping(){
		Hashtable<String, String> M2 = new Hashtable<>();
		for(Map.Entry<String, String> entry: M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	
	ArrayList<String> getAllCountries(){
		ArrayList<String> list = new ArrayList(M1.keySet());
		return list;
	}

}
