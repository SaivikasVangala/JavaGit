
class Bank1 {
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank1 {
	@Override
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI extends Bank1 {
	@Override
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends Bank1 {
	@Override
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class Polymorph {
	public static void main(String args[]) {

		Bank1 b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		Bank1 b1 = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b1.getRateOfInterest());
		Bank1 b2 = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b2.getRateOfInterest());
	}
}

