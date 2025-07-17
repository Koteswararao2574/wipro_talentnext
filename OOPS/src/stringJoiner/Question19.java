package stringJoiner;
import java.util.StringJoiner;
public class Question19 {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("Ongole");
		sj1.add("Guntur");
		sj1.add("Chirala");
		sj1.add("Vijayawada");
		StringJoiner sj2 = new StringJoiner("-");
		sj2.add("Tirupathi");
		sj2.add("Chandragiri");
		sj2.add("Srikalahasthi");
		sj2.add("Renugunta");
		StringJoiner newStr1 = new StringJoiner("-");
		newStr1.merge(sj1);
		newStr1.merge(sj2);
		System.out.println("s2 merged to s1: " + newStr1);
		StringJoiner newStr2 = new StringJoiner("-");
		newStr2.merge(sj2);
		newStr2.merge(sj1);
		System.out.println("s1 merged to s2: " + newStr2);

	}
}
