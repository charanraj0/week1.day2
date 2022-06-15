package assignment.week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		int length = arr.length;
		Arrays.sort(arr);
		for (int i = arr[0]; i < length; i++) {
			if(arr[i]!=i+1) {
			System.out.println("Print the missing number :"+ (i+1));	
			break;
		}
		//System.out.println(arr);
	}
	}
}
