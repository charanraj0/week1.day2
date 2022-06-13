package assignment.week1.day2;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chasisNumber = 29379247868475L;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield";
	double runningKM = 14354.245;
	
	public static void main(String[] args) {
	TwoWheeler obj = new TwoWheeler();
	String bikeName2 = obj.bikeName;
	System.out.println("BIKE NAME: " +bikeName2);
	long chasis = obj.chasisNumber;
	System.out.println("CHASIS: " +chasis);
	int wheels = obj.noOfWheels;
	System.out.println("WHEELS: " +wheels);
	short mirrors = obj.noOfMirrors;
	System.out.println("MIRROR: " +mirrors);
	double kilometer = obj.runningKM;
	System.out.println("KILOMETER: " +kilometer);
	boolean isPuncture = obj.isPunctured;
	System.out.println("IS PUNCTURE: " +isPuncture);
	
	
}
}
