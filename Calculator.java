package week1day2.Assignments;

public class Calculator {

	int add,sub,mul,div;
	int n1=2;
	int n2=4;
	int n3=6;
	
	double mulnum1=5;
	double mulnum2=2.5;
	double mul1;
	
	float divnum1=100;
	float divnum2=5;
	float div1;
	
	public void add() {
		
		add=n1+n2+n3;
		System.out.println(+add);	
	}
	
public void sub() {
		
		sub=n2-n1;
			System.out.println(+sub);	
	}
public void mul1() {
	
	mul1=(mulnum1*mulnum2);
	System.out.println(+mul1);
}
public void div1() {
	
	div1=divnum1/divnum2;
	System.out.println(+div1);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator objcalc= new Calculator();
		
		objcalc.add();
		objcalc.sub();
		objcalc.mul1();
		objcalc.div1();
		
		System.out.println("This is my calculator with formula in public void method. All the public void method results can be printed only main method in this and othet classes in this package by creating object");
		
	}

}
