package abstractAndInterfaces;

import java.util.Random;

public class Question1 {

	public static void main(String[] args) {
		Compartment[] compartment = new Compartment[10];
		Random rand = new Random();
		for(int i=0;i<compartment.length;i++) {
			int choice = rand.nextInt(4)+1;
			
			 switch (choice) {
             case 1:
                 compartment[i] = new FirstClass();
                 break;
             case 2:
                 compartment[i] = new Ladies();
                 break;
             case 3:
                 compartment[i] = new General();
                 break;
             case 4:
                 compartment[i] = new Luggage();
                 break;
         }
			 System.out.println("Compartment: " + (i+1) + " Notice: " + compartment[i].notice());
		}

	}

}

abstract class Compartment{
	public abstract String notice();
}

class FirstClass extends Compartment{
	public String notice(){
		return"This is a FirstClass Compartment";
	}
}

class Ladies extends Compartment{
	public String notice(){
		return"This is a Ladies Compartment";
	}
}

class General extends Compartment{
	public String notice(){
		return"This is a General Compartment";
	}
}

class Luggage extends Compartment{
	public String notice(){
		return"This is a Luggage Compartment";
	}
}
