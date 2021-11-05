package week1day2.Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		int lenArray= arr.length;
		
		Arrays.sort(arr);
		
				
		for (int i = 1; i < arr.length; i++) {
			
			
			if (i!=arr[i-1]) {
				
				System.out.println(i);	
				break;
							
			    }
			
			}
		
		}
	
	}


