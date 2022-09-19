import java.util.Scanner;

class Sum {
	void add(int x, int y) {
		System.out.println("Integer value = " + (x + y));
	}

	void add(float x, float y) {
		System.out.println("Decimal value = " + (x + y));
	}
}
public class MethodOverload {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Sum s = new Sum();
		System.out.println("Enter 2 values ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		s.add(a, b);
		System.out.println("Enter float value");
		s.add(sc.nextFloat(), sc.nextFloat());
	}

}
