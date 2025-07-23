package ThreadPriorities;

public class Question1 extends Thread {

	public static void main(String[] args) {
		Question1 t = new Question1();
		t.start();

	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i == 5) {
				try {
					Thread.sleep(5000);
				} catch(InterruptedException ie) {
					System.out.println("Interrupted ExceptionL " + ie);
				}
			}
		}
	}

}
