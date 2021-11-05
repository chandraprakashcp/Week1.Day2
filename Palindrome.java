package week1day2.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="MADAM";
		String rev="";
		int len=a.length();
		
		for (int i = len-1; i >= 0; i--) {
			rev = rev + a.charAt(i);
						
			}
		
		if (a.equals(rev)) {
			System.out.println("The given string "+rev+" is palinDrome");
		} else {
			System.out.println("The given string "+rev+" is Not a palinDrome");
		}
		
	}

}
