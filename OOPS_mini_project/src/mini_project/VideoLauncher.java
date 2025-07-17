package mini_project;
import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore vs = new VideoStore();
		while (true) {
			System.out.println();
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos : ");
			System.out.println("2.Check Out Video : ");
			System.out.println("3.Return Video : ");
			System.out.println("4.Receive Rating : ");
			System.out.println("5.List Inventory : ");
			System.out.println("6.Exit : ");
			System.out.print("Enter your choice (1..6): ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the name of the video you want to add:");
				sc.nextLine();
				String name = sc.nextLine();
				vs.addVideo(name);
				break;
			case 2:
				System.out.print("Enter the name of the video you want to check out:");
				sc.nextLine();
				String name1 = sc.nextLine();
				vs.doCheckout(name1);
				break;
			case 3:
				System.out.print("Enter the name of the video you want to return:");
				sc.nextLine();
				String name2 = sc.nextLine();
				vs.doReturn(name2);
				break;
			case 4:
				System.out.print("Enter the name of the video you want to Rate:");
				sc.nextLine();
				String name3 = sc.nextLine();
				System.out.print("Enter the rating for this video:");
				int rating = sc.nextInt();
				vs.receiveRating(name3, rating);
				break;
			case 5:
				vs.listInventory();
				break;
			case 6:
				System.out.println("Exiting...!! Thanks for using the application.");
				return;
			default:
				System.out.println("Invalid choice.");
				System.out.println("Please enter the number between 1-6.");
			}

		}

	}

}

class Video {
	private String videoName;
	private boolean checkout;
	private int rating;

	public Video(String name) {
		this.videoName = name;
	}

	String getName() {
		return this.videoName;
	}

	void doCheckout() {
		this.checkout = true;
	}

	void doReturn() {
		this.checkout = false;

	}

	void receiveRating(int rating) {
		this.rating = rating;
	}

	int getRating() {
		return this.rating;
	}

	boolean getCheckout() {
		return this.checkout;
	}
}

class VideoStore {
	Video[] store = new Video[100];
	int count = 0;

	void addVideo(String name) {
		store[count++] = new Video(name);
		System.out.println("Video \"" + name + "\" added successfully.");
	}

	void doCheckout(String name) {
		for (int i = 0; i < count; i++) {
			if (store[i].getName().equalsIgnoreCase(name)) {
				store[i].doCheckout();
				System.out.println("Video \"" + name + "\" checked out successfully.");
				return;
			}

		}
		System.out.println("Video \"" + name + "\" not found.");

	}

	void doReturn(String name) {

		for (int i = 0; i < count; i++) {
			if (store[i].getName().equalsIgnoreCase(name)) {
				store[i].doReturn();
				System.out.println("Video \"" + name + "\" returned successfully.");
				return;
			}

		}
		System.out.println("Video \"" + name + "\" not found.");

	}

	void receiveRating(String name, int rating) {
		for (int i = 0; i < count; i++) {
			if (store[i].getName().equalsIgnoreCase(name)) {
				store[i].receiveRating(rating);
				System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
				return;
			}

		}
		System.out.println("Video \"" + name + "\" not found.");

	}

	void listInventory() {
		System.out.println("------------------------------------------------------");
//		System.out.println("Video Name" + "\t|\tCheckout Status" + "\t|\tRating");
		System.out.printf("%-20s | %-16s | %-6s\n", "Video Name", "Checkout Status", "Rating");
		for (int i = 0; i < count; i++) {
			String name = store[i].getName();
			boolean status = store[i].getCheckout();
			int rating = store[i].getRating();
//			System.out.println(name + "\t\t|\t\t" +  status + "\t\t|\t\t" + rating);
			System.out.printf("%-20s | %-16s | %-6d\n", name, status, rating);

		}

		System.out.println("------------------------------------------------------");
	}
}
