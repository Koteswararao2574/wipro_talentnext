package Inheritance;

public class Question4 {

	public static void main(String[] args) {
        Animal obj1=new Animal();
        Bird obj2=new Bird();
        obj1.eat();
        obj1.sleep();
        obj2.eat();
        obj2.sleep();
        obj2.fly();
	}

}
class Animal{
	public void eat() {
		System.out.println("parent eat method");
	}
	public void sleep() {
		System.out.println("parent sleep method");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("child eat method");
	}
	public void sleep() {
		System.out.println("child sleep method");
	}
	public void fly() {
		System.out.println("child fly method");
	}
}
