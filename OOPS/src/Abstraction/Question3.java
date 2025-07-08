package Abstraction;

public class Question3 {
	public static void main(String[] args) {
		Author author = new Author("osho","osho15@gmail.com",'M');
		Book book = new Book("rich dad",author,1000.0,100);
		System.out.println(
				"Book Name: " + book.getbookName() + "\nAuthor Name: " + book.getAuthor().getName() + "\nAuthor Email: " + book.getAuthor().getEmail() + "\nAuthor Gender: " + book.getAuthor().getGender() + "\nPrice: " + (double)book.getPrice() + "\nQuantity: " + book.getQty()
				);
	}
}
class Author{
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public char getGender() {
		return this.gender;
	}
}
class Book{
	private String bookName;
	private Author author;
	private double price;
	private int qty;
	public Book(String bookName,Author author,double price,int qty) {
		this.bookName=bookName;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public void setbookName(String bookName) {
		this.bookName=bookName;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public String getbookName() {
		return this.bookName;
	}
	public Author getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return (double)this.price;
	}
	public int getQty() {
		return this.qty;
	}
	
}
