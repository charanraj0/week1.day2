package assignment.week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j=(i+1); j < length; j++) {
				if (arr[i]==arr[j]) {
				count++;
			}
			
		}
			if(count>0) {
				System.out.println(arr[i] + " has duplicate enrty");
			}
	}
	}
}
