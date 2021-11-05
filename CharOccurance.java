package week1day2.Assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		int count=0;
		char[] str1=str.toCharArray();
		
		char alp='e';
		int lenarray= str.length();
	

for (int i = 0; i < str1.length; i++) {
	
	if (str1[i]==alp) {
		
		count=count+1;
	} else {

	}
	
}
	
System.out.println("The alphabet " +alp+ " occured in the given string is "+count);
	}

}
