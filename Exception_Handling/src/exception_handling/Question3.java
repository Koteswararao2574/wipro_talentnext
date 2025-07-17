package exception_handling;

public class Question3 {
	public static void main(String[] args) throws Exception {
		try {
			if (args.length != 5) {
				throw new IllegalArgumentException("Please enter 5 Integer values.");
			}
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += Integer.parseInt(args[i]);
			}
			double avg = (double) sum / 5;
			System.out.println("Sum: " + sum);
			System.out.println("Average: " + avg);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
