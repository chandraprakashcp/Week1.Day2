package week1day2.Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="stop";
		String text2="potss";
		
		int lenarray1=text1.length();
		int lenarray2=text2.length();
		
		if (lenarray1==lenarray2) {
			
			System.out.println("length of the array text1:"+lenarray1+" and length of the array text2 :"+lenarray2+ "So the lenth of the text1 and text2 are same");
            
			char[] char1=text1.toCharArray();
			char[] char2=text2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
		
			if (char1==char2) {
				System.out.println(char1);
				System.out.println(char2);
				System.out.println("This is a Anagram");
			}
			System.out.println(char1);
			System.out.println(char2);
			System.out.println("This is a not Anagram");
		
		}
		
		
		else {
			
			System.out.println("length of the array text1 :"+lenarray1+" and length of the array text2 :"+lenarray2+" So the length of the text1 and text2 are NOT same");
			
			char[] char1=text1.toCharArray();
			char[] char2=text2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
		
			if (char1==char2) {
				System.out.println("char 1 :"+char1+ "char 2"+char2+" are same");
				System.out.println(" This is Anagram");
			}
			
			System.out.println("This is Not a Anagram");
			
		}
		
		
	}

}
