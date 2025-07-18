package Collections_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question4 {

	public static void main(String[] args) {
		ContactList cl = new ContactList();
		cl.addContact("Sai Venkata Chandran", 1234567890);
		cl.addContact("Bhupathi Kumar", 1212121212);
		cl.addContact("Topper", 1231231231);
		cl.addContact("Master", 1234512345);
		cl.printAll();
		System.out.println(cl.checkKey("Topper"));
		System.out.println(cl.checkValue(1212121212));
	}

}


class ContactList{
	HashMap<String, Integer> map = new HashMap<>();
	
	void addContact(String name, int number) {
		map.put(name, number);
	}
	String checkKey(String name) {
		for(String k:map.keySet()) {
			if(k.equalsIgnoreCase(name)) {
				return name + "is exists in ContactList.";
			
			}
		}
		return name + "does not exist in ContactList.";
	}
	
	String checkValue(int number) {
		for(int k:map.values()) {
			if(k == number) {
				return number + "is exists in ContactList.";
			
			}
		}
		return number + "does not exist in ContactList.";
	}
	
	void printAll() {
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entry.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> m = it.next();
			System.out.println("Contact Name: " + m.getKey() + ", Number: " + m.getValue());
		}
	}
}
