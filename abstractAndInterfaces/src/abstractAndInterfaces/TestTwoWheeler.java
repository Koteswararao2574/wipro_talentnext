package abstractAndInterfaces;

import com.automobile.Vehicle;
import com.automobile.twowheeler.*;

public class TestTwoWheeler {

	public static void main(String[] args) {
		Hero hero = new Hero("ABC","123","SAI",100);
		System.out.println("Model Name: " + hero.getModelName());
		System.out.println("Registration Number: " + hero.getRegistrationNumber());
		System.out.println("Owner Name: " + hero.getOwnerName());
		System.out.println("Speed: " + hero.getSpeed()+ " km/hr");
		hero.radio();
		System.out.println();
		Honda honda = new Honda("XYZ","789","CHANDRAN",160);
		System.out.println("Model Name: " + honda.getModelName());
		System.out.println("Registration Number: " + honda.getRegistrationNumber());
		System.out.println("Owner Name: " + honda.getOwnerName());
		System.out.println("Speed: " + honda.getSpeed()+ " km/hr");
		honda.cdplayer();
		System.out.println();
	}

}
