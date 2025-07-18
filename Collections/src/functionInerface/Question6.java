package functionInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Question6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Welcome","To","Wipro","Training","Classes","This","Is","Our","First","Session"));
		Consumer<ArrayList<String>> reversed = words -> {
			for(int i=0;i<words.size();i++) {
				words.set(i, new StringBuilder(words.get(i)).reverse().toString());
			}
		};
		reversed.accept(list);
		System.out.println("Reversed words: " + list);
	}

}
