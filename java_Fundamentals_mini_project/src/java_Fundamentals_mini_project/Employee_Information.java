package java_Fundamentals_mini_project;

public class Employee_Information {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Please Enter Employee Id.");
			return;
		}

		int[] emp_No = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String[] emp_Name = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
		String[] join_Date = { "01/04/20009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
				"12/06/2006" };
		char[] designation_Code = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String[] department = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		int[] basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int[] it = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		char[] design_Code = { 'e', 'c', 'k', 'r', 'm' };
		String[] designation = { "Engineer", "Consultant", "Clerk", "Receptionist", "Manager" };
		int[] da = { 20000, 32000, 12000, 15000, 40000 };

		for (int i = 0; i < emp_No.length; i++) {
			if (emp_No[i] == Integer.parseInt(args[0])) {
				String designation_Value = "";
				int da_Amount = 0;

				switch (designation_Code[i]) {
				case 'e':
					designation_Value = "Engineer";
					da_Amount = 20000;
					break;
				case 'c':
					designation_Value = "Consultant";
					da_Amount = 32000;
					break;
				case 'k':
					designation_Value = "Clerk";
					da_Amount = 12000;
					break;
				case 'r':
					designation_Value = "Receptionist";
					da_Amount = 15000;
					break;
				case 'm':
					designation_Value = "Manager";
					da_Amount = 40000;
					break;
				default:
					System.out.println("Invalid code");
				}

				int Salary = basic[i] + hra[i] + da_Amount - it[i];

//				System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
//				System.out.println(emp_No[i] + "\t" + emp_Name[i] + "\t" + department[i] + "\t" + designation_Value
//						+ "\t" + Salary + "\t");
				System.out.printf("%-8s %-10s %-15s %-15s %s\n", "Emp No.", "Emp Name", "Department", "Designation",
						"Salary");
				System.out.printf("%-8d %-10s %-15s %-15s %d\n", emp_No[i], emp_Name[i], department[i],
						designation_Value, Salary);

				return;
			}
		}
		System.out.println("There is no employee with empid: " + args[0]);
	}

}
