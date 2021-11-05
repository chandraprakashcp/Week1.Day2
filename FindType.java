package week1day2.Assignments;

public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int letter=0;
		int space=0;
		int num=0;
		int spcar=0;
		
		char[] str1=test.toCharArray();
		
		int lenarray= test.length();
		
		for (int i = 0; i < lenarray; i++) {
			
			
				
			if (Character.isLetter(0)) {
				//letter=letter+i;
				System.out.println(i);
				i=i+1;
			}
			
			
			
		}
		System.out.println("letter: " + letter);
		
	}


	}


