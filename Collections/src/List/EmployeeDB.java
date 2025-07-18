package List;

import java.util.ArrayList;

public class EmployeeDB {
	private ArrayList<Employee> list;

	public EmployeeDB() {
		this.list = new ArrayList<>();
	}

	boolean addEmployee(Employee e) {
		return list.add(e);
	}

	boolean deleteEmployee(int empId) {
		for (Employee e : list) {
			if (e.getEmpId() == empId) {
				list.remove(e);
				return true;
			}
		}
		return false;
	}

	String showPaySlip(int empId) {
		for (Employee e : list) {
			if (e.getEmpId() == empId) {
				return "PaySlip for Emp ID: " + empId + " is: ₹" + e.getSalary();
			}
		}
		return "Employee not found with Emp ID:" + empId;
	}

	void showAllEmployees() {
		for (Employee e : list) {
			e.GetEmployeeDetails();
			System.out.println();
		}
	}

}
