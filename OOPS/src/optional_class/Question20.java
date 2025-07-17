package optional_class;

import java.util.Optional;

public class Question20 {

	public static void main(String[] args) {
		String[] names = new String[5];
		Optional<String> opt = Optional.ofNullable(names[0]);
		if(opt.isPresent()) {
			System.out.println(names[0].length());
		}else {
			System.out.println("The string is empty");
		}

	}

}
