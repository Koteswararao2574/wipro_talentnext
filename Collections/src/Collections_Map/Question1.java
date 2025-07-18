package Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
		CountryAndCaptials cc = new CountryAndCaptials();
		cc.saveCountryCapital("India", "Delhi");
		System.out.println(cc.saveCountryCapital("Japan", "Tokyo"));
		System.out.println(cc.getCapital("India"));
		System.out.println(cc.getCountry("Delhi"));
		System.out.println(cc.reverseMapping());
		System.out.println(cc.getAllCountries());

	}

}


class CountryAndCaptials{
	HashMap<String,String> M1= new HashMap<>();
	
	HashMap<String,String> saveCountryCapital(String CountryName, String capital){
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
	HashMap<String, String> reverseMapping(){
		HashMap<String, String> M2 = new HashMap<>();
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
