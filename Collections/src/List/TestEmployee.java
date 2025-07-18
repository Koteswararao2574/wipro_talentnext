package List;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee(001, "Sai","sai@gamil.com","Male",100000);
		Employee emp2 = new Employee(002, "Venkata","venkata@gamil.com","Male",150000);
		Employee emp3 = new Employee(003 ,"Chandran","chandran@gamil.com","Male",200000);
		EmployeeDB db = new EmployeeDB();
		db.addEmployee(emp1);
		db.addEmployee(emp2);
		db.addEmployee(emp3);
		db.showAllEmployees();
		db.deleteEmployee(002);
		db.showAllEmployees();
		System.out.println(db.showPaySlip(001));
	}
}
