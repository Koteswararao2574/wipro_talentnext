package IOstreams;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class EmployeeManagementSystem {
	static final String fileName = "employees.txt";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addEmployee(sc);
				break;
			case 2:
				displayEmployee();
				break;
			case 3:
				System.out.println("Exiting the System");
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private static void addEmployee(Scanner sc) {
		try {
			System.out.print("Enter Employee ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Employee Age: ");
			int age = sc.nextInt();

			System.out.print("Enter Employee Salary: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, age, salary);

			FileWriter fw = new FileWriter(fileName, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(emp.toString());
			bw.newLine();
			bw.close();

			System.out.println("Employee added successfully.");

		} catch (IOException e) {
			System.out.println("Error while writing to file: " + e.getMessage());
		}
	}

	private static void displayEmployee() {
		System.out.println("----Report-----");
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			System.out.println("----End of Report-----");
		} catch (FileNotFoundException e) {
			System.out.println("No employees found.");
		} catch (IOException e) {
			System.out.println("Error while reading from file: " + e.getMessage());
		}
	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + age + " " + salary;
	}
}
