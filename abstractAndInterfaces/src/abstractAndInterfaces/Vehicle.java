package abstractAndInterfaces;

public interface Vehicle {
	default void message() {
		System.out.println("Inside Vehicle");
	}

}
