
class Student1 {
	int rollno;
	String name;
	static String college = "NMREC";

	Student1(int r, String n) {
		rollno = r;
		name = n;
	}

	static void change() {
		college = "SNIST";
	}



	void display() {
		System.out.println("rollno = " + rollno);
		System.out.println("name =" + name);
		System.out.println("college = " + college);
	}
}

public class StaticMethod {
	public static void main(String args[]) {
		Student1.change();
		Student1 s1 = new Student1(111, "sai");
		Student1 s2 = new Student1(222, "vikas");
		Student1 s3 = new Student1(333, "Ajay");
		s1.display();
		s2.display();
		s3.display();
	}
}



