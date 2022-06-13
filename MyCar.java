package assignment.week1.day2;

public class MyCar {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.applyAccelerate();
		System.out.println("Accelerate");
		boolean break1 = obj.applyBreak();
		System.out.println("Break Applied: " +break1);
		int gear = obj.applyGear();
		System.out.println("Gear Shifted: " +gear);
		obj.switchOnAc();
		//System.out.println("AC Turned ON");
	}
}
