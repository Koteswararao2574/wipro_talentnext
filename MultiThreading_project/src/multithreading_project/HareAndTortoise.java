package multithreading_project;

public class HareAndTortoise {
	public static void main(String[] args) {
		RunningRace hare = new RunningRace("Hare");
		RunningRace tortoise = new RunningRace("Tortoise");
		hare.setPriority(Thread.MAX_PRIORITY);
		tortoise.setPriority(Thread.MIN_PRIORITY);
		hare.start();
		tortoise.start();
	}

}

class RunningRace extends Thread {
	String name;
	public static volatile boolean raceOver = false;

	RunningRace(String name) {
		this.name = name;
		setName(name);
	}

	public void run() {
		for (int i = 1; i <= 100 && !raceOver; i++) {
			System.out.println(name + " ran " + i + " meters.");

			if (name.equals("Hare") && i == 60) {
				System.out.println("Hare is sleeping at " + i + " meters.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					System.out.println("Interrupted Exception: " + ie);
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException ie) {
				System.out.println("Interrupted Exception: " + ie);
			}
			if (i == 100 && !raceOver) {
				raceOver = true;
				System.out.println(name + " wins the race.");
			}

		}

	}
}
