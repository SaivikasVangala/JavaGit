
class Booking {
	int Total_no_Of_Persons;
	String Boarding, destination;
	static String date;
	double Distance;
	byte noOfDays;
	float Price;
}

public class BusTickets {
	public static void main(String args[]) {
		Booking B = new Booking();
		B.Total_no_Of_Persons = 5;
		B.Boarding = "Hyderabad";
		B.destination = "Koadaikanal";
		B.noOfDays = 12;
		B.Price = 8452.3f;

		System.out.println("destination " + B.destination);
		System.out.println("Total_no_Of_Persons =" + B.Total_no_Of_Persons);
		System.out.println("Boarding from " + B.Boarding);
		System.out.println("Total noOfDays =" + B.noOfDays);
		System.out.println("Price per ticket = " + B.Price);

	}
}
