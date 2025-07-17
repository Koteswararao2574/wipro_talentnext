package abstractAndInterfaces;

public interface FourWheeler {
	default  void message() {
		 System.out.println("Inside FourWheeler");
	 }
}
