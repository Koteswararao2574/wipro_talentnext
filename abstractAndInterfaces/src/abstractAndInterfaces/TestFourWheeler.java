package abstractAndInterfaces;

import com.automobile.*;
import com.automobile.FourWheeler.*;

public class TestFourWheeler {

	public static void main(String[] args) {
		Logan logan  = new Logan("ABC","123","SAI",100);
		System.out.println("Model Name: " + logan.getModelName());
		System.out.println("Registration Number: " + logan.getRegistrationNumber());
		System.out.println("Owner Name: " + logan.getOwnerName());
		System.out.println("Speed: " + logan.getSpeed() + " km/hr");
		logan.GPS();
		System.out.println();
		Ford ford = new Ford("XYZ","789","CHANDRAN",160);
		System.out.println("Model Name: " + ford.getModelName());
		System.out.println("Registration Number: " + ford.getRegistrationNumber());
		System.out.println("Owner Name: " + ford.getOwnerName());
		System.out.println("Speed: " + ford.getSpeed()+ " km/hr");
		ford.tempControl();
		System.out.println();

	}

}