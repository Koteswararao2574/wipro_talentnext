package Polymorphism;

public class Question6 {
		public static void main(String[] args) {
			Apple apple = new Apple();
			apple.eat();
			Orange orange = new Orange();
			orange.eat();
	}

}
	class Fruit{
		String name;
		String taste;
		String size;
		
		public Fruit(String name, String taste, String size) {
			this.name = name;
			this.taste = taste;
			this.size = size;
		}
		
		void eat() {
			System.out.println("Name of the fruit is " + name + " and it tastes like " + taste +".");
			
		}
	}

	class Apple extends Fruit{
		public Apple() {
			super("Apple","Sweet and juicy","Big");
		}
		
		void eat() {
			System.out.println("Name of the fruit is " + name + " and it tastes like " + taste +".");
			
		}
		
	}

	class Orange extends Fruit{
		public Orange() {
			super("Orange","Citrusy and tangy","Medium");
		}
		
		void eat() {
			System.out.println("Name of the fruit is " + name + " and it tastes like " + taste +".");
			
		}
		
	}
