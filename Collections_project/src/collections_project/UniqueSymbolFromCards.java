package collections_project;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class UniqueSymbolFromCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Card> uniqueCards = new LinkedHashSet<>();
		Set<Character> uniqueSymbol = new HashSet<>();

		while (uniqueSymbol.size() < 4) {
			System.out.println("Enter the card");
			char symbol = sc.next().toLowerCase().charAt(0);
			int number = sc.nextInt();

			Card card = new Card(symbol, number);
			uniqueCards.add(card);
			uniqueSymbol.add(symbol);
		}
		System.out.println("Four symbols are gathered in " + uniqueCards.size() + " cards.");
		System.out.println("Cards in set are: ");
		Map<Character, Card> unique = new TreeMap<>();
		for (Card c : uniqueCards) {
			if (!(unique.containsKey(c.getSymbol()))) {
				unique.put(c.getSymbol(), c);
			}
		}

		for (Card c : unique.values()) {
			System.out.println(c);
		}

	}

}

class Card {
	private char symbol;
	private int num;

	public Card(char symbol, int num) {
		this.symbol = symbol;
		this.num = num;
	}

	// first hashcode method is called
	// Java uses hashcode to check which bucket in the HashSet might already contain
	// a box with this same card and num.
//	It compares newCard with any existing boxes in the same bucket.
//	hashCode() matched and equals() returned true Java doesn’t add the new box — it's considered a duplicate.
	public int hashCode() {
		return Objects.hash(symbol, num);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true; // same reference
		// it checks whether the current obj and checking obj are refering to the
		// same memory means the obj are same so it return true and not the element is
		// not added to the set
		if (!(obj instanceof Card))
			return false; // type check
		// it handles the invalid data types example when we pass a integer to the type
		// string Ex box.equals(s) where box is instance of Box and s is String type so
		// it immediately returns false;
		Card card = (Card) obj;
		return this.symbol == card.symbol && this.num == card.num; // content check
		// here the obj are different but the contents inside object
//		are same so we have to override equals method to check the content inside objects
	}

	public char getSymbol() {
		return symbol;
	}

	public int getNum() {
		return num;
	}

	public String toString() {
		return symbol + " " + num;
	}
}

//Step 1: hashCode() is called on the new object
//Java uses this value to find the "bucket" in the HashSet.
//
//If no other object in that hash bucket, it adds the object.
//
//Step 2: If an object with the same hashCode already exists in that bucket:
//Java calls equals() on the new object to compare with existing ones.
//
//If equals() returns true, the object is considered a duplicate → not added
//If false, it is considered different → added

// hash code method
// Generates a consistent hash value based on symbol and number.

//Ensures that two Card objects with the same data produce the same hashCode.
//
//🔁 Java’s contract:
//If two objects are equal (according to equals()), then their hashCode() must also be equal.
