class Student {
	String FathersName;
	int RollNo;
	float marks;
	static String college, place;
}
class Employee {
	String name;
	int empId;
	float Salary;
	static String company;
}
public class VarClass {

	public static void main(String[] args) {
		System.out.println("-------------------------");
		Student Vikas = new Student();
		Vikas.FathersName = "Rajamouli";
		Vikas.RollNo = 147;
		Vikas.marks = 990.9f;
		Student.college = "NMREC";
		Student.place = "Hyderabad";
		System.out.println(Vikas.FathersName);
		System.out.println(Vikas.marks);
		System.out.println(Vikas.RollNo);
		System.out.println(Vikas.marks);
		System.out.println(Student.college);
		System.out.println(Student.place);
		System.out.println("-------------------------");
		Employee emp = new Employee();
		emp.name = "SaiVikas";
		emp.empId = 264;
		emp.Salary = 4500.30f;
		Employee.company = "Google";
		System.out.println(emp.name);
		System.out.println(emp.empId);
		System.out.println(emp.Salary);
		System.out.println(Employee.company);
		System.out.println("-------------------------");
	}

}
