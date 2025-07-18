package lambdaExpressions;

public class MyClassLambda {
	public static void main(String[] args) {
		WordCount wc = (s) -> {
			if(s == null || s.isEmpty()) return 0;
			return s.split("\\s+").length;
		};
		String str = "Welcome to Hello World";
		System.out.println("Length of the string \"" + str + "\" is: " + wc.count(str));
	}

}


interface WordCount{
	int count(String str);
}
