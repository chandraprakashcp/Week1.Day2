package week1day2.Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrnum1 []= {3,2,11,4,6,7};
		int arrnum2 []= {1,2,8,4,9,7};
		
		int lenArray1= arrnum1.length;
		int lenArray2= arrnum2.length;
		
		for (int i = 0; i < arrnum1.length; i++) {
			
			for (int j = 0; j < arrnum2.length; j++) {
				
				if (arrnum1[i]==arrnum2[j]) {
					
					System.out.println("The Intersect number of both the array is :" +arrnum1[i]);
				}
				
			}
		}
	}

}
