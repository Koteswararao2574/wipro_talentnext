package streams;

public class Student {
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public String toString()
	{
		return roll + "-" + name + "-" + marks;
	}

}
