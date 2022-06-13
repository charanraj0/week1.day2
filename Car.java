package assignment.week1.day2;

public class Car{
	public static void main(String[] args) {
		Car obj = new Car();
		boolean break1 = obj.applyBreak();
		System.out.println("BREAK APPLIED: " +break1);
		int gear = obj.applyGear();
		System.out.println("GEAR :" +gear);
		obj.switchOnAc();
		System.out.println("AC Turned On");
		obj.applyAccelerate();
		System.out.println("Accelerator Applied");
	}
	
	public boolean applyBreak() {
		return false;
	}
	
	public int applyGear() {
		return 1;
		
	}
	
	public void switchOnAc() {
	System.out.println("AC Turned ON");	
	}
	
	public void applyAccelerate() {
		
	}
}