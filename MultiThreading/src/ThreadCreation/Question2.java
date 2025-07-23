package ThreadCreation;
import java.util.Random;
public class Question2 {
	public static void main(String[] args) {
		Colors c = new Colors();
		Thread t = new Thread(c);
		t.start();

	}

}

class Colors implements Runnable{
	String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
	Random rand = new Random();
	
	public void run() {
		while(true) {
			int index = rand.nextInt(colors.length);
			String displayColor = colors[index];
			System.out.println(displayColor);
			if(colors[index].equals("red")){
				System.out.println("Found red! stopping...");
				break;
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				System.out.println("Thread interrupted " + ie);
			}
		}
	}
}

