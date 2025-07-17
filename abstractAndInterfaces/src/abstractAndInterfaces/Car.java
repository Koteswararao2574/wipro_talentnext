package abstractAndInterfaces;

public class Car implements Vehicle, FourWheeler {

	public static void main(String[] args) {
		Car car = new Car();
		car.message();

	}
	
	public void message() {
		Vehicle.super.message();
		System.out.println("Inside Car");
	}

}
